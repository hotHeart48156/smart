package org.product.domain.valueobject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yangbiao
 */

public class ValueObjectFactory {
    public static <T extends ValueObject, V extends Object> T newInstance(Class<T> c, V... v) {
        T t = null;

        try {

            Class a = c.forName(c.getName());
            for (Constructor constructor : a.getConstructors()) {
                t = (T) constructor.newInstance(v);
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static <T extends ValueObject> T newInstance(Class<T> c) {
        T t = null;
        try {
            Class a = c.forName(c.getName());
            for (Constructor constructor : a.getConstructors()) {
                t = (T) constructor.newInstance();
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
        return t;
    }
}
