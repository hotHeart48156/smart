package org.users.domain.entity;

import java.lang.reflect.InvocationTargetException;

/**
 * @author "yangbiao"
 */
public class EntityFactory {

    public static <T extends Entity> T newInstance(Class<T> t) {
        T entity = null;
        try {
            entity = (T) Class.forName(t.getName()).getConstructor().newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return entity;

    }

}
