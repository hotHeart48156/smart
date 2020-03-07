package org.users.domain.entity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author "yangbiao"
 */
public class EntityFactory {

    public static <T extends Entity,V extends Object> T newInstance(Class<T> c,V ...v) {
        T entity = null;
        try {
            Class a =  c.forName(c.getName());
            for ( Constructor constructor : a.getConstructors()){
                entity=(T)constructor.newInstance(v);
            }


        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return entity;

    }

}
