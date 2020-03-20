package org.activite;

import org.activite.domain.GetAllClass;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author yangbiao
 */

public class GetTablePrimaryKey {
    private Map<String,String> tablePrimaryKey;
    public void generateTablePrimaryKey(String idPackage, String... packages){
        List<String> classPaths=new ArrayList<>();
        List<String> idPath=new ArrayList<>();
        for (String pack:packages) {
            classPaths.addAll(GetAllClass.getClassName(pack));

        }
        idPath=GetAllClass.getClassName(idPackage);
        
        for (String classPath:classPaths){
            try {
                Class c=Class.forName(classPath);

                Annotation annotation=c.getAnnotation(javax.persistence.EmbeddedId.class);
                annotation.annotationType();
               c.getField("id").


            } catch (ClassNotFoundException | NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
    }

}
