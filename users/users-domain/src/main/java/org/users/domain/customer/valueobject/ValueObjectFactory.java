package org.users.domain.customer.valueobject;

import java.lang.reflect.InvocationTargetException;

/**
 * @author "yangbiao"
 */
public class ValueObjectFactory {
    public static <T extends ValueObject, V extends Object> T newInstance(Class<T> c, Class<V> v) {
        T t = null;
        try {
            t = (T) Class.forName(c.getName()).getConstructor(v).newInstance();

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
        return t;
    }

    public static <T extends ValueObject, V extends Object> T newInstance(Class<T> c) {
        T t = null;
        try {
            t = (T) Class.forName(c.getName()).getConstructor().newInstance();

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
        return t;
    }
}
