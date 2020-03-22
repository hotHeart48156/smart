package org.activite;

import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

/**
 * @author yangbiao
 */
@Slf4j
@Component
public class TablePrimaryKey {
   private Map<String,String> tablePrimaryKeys;
    private Map<String,String> allFieldNameAndPrimaryKeyName;
   private Map<String,String> allTablePrimaryKeyFieldName;
    public void genAllPrimaryKeyName(String idPackage){
        Reflections reflections=new Reflections(new ConfigurationBuilder().setUrls(ClasspathHelper.forPackage(idPackage)).setScanners(new FieldAnnotationsScanner()));
        Set<Field> fields=reflections.getFieldsAnnotatedWith(Column.class);

        fields.forEach(field -> {
            allFieldNameAndPrimaryKeyName.put(field.getName(),field.getDeclaredAnnotation(Column.class).name());
        });

    }
    public void  genTablePrimaryKeyFieldName(String tablepackage){
        Reflections reflections=new Reflections(new ConfigurationBuilder().setUrls(ClasspathHelper.forPackage(tablepackage)).setScanners(new FieldAnnotationsScanner()));
        Set<Field> fields=reflections.getFieldsAnnotatedWith(EmbeddedId.class);
        Set<Class<?>> clazzs= reflections.getTypesAnnotatedWith(Table.class);
        for (Class<?> clazz :clazzs){
            String tabname=clazz.getAnnotation(Table.class).name();
            String primarykey=null;
            for (Field field:clazz.getFields()) {
                if (field.isAnnotationPresent(EmbeddedId.class)){
                    primarykey=field.getName();
                }
            }
            allTablePrimaryKeyFieldName.put(tabname,primarykey);
        }
    }

    public Map<String,String> getTablePrimaryKey(String tablepackage,String idpackage){
        genAllPrimaryKeyName(idpackage);
        genTablePrimaryKeyFieldName(tablepackage);
        for (String tablename : allTablePrimaryKeyFieldName.keySet()){
            String fieldnamea=allTablePrimaryKeyFieldName.get(tablename);
            for (String filednameb : allFieldNameAndPrimaryKeyName.keySet()){
                String primaryKeyName=allFieldNameAndPrimaryKeyName.get(filednameb);
                if (fieldnamea.equals(filednameb)){
                    tablePrimaryKeys.put(tablename,filednameb);
                }else {
                    log.debug("primary key not found");
                }
            }
        }
        return tablePrimaryKeys;
    }
}
