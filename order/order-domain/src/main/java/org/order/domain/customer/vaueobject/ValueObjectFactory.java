package org.order.domain.customer.vaueobject;

import java.lang.reflect.Field;

/**
 * @author "yangbiao"
 */
public class ValueObjectFactory {
    public static volatile ValueObject instance = null;

    public static <T extends ValueObject> T getInstance(Class<T> c, Object v) {

        if (instance == null) {
            synchronized (ValueObjectFactory.class) {
                if (instance == null) {
                    try {
                        instance = (ValueObject) Class.forName(c.getName()).getConstructor(v.getClass()).newInstance(v.getClass());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return (T) instance;
    }

    public static <T extends ValueObject> T getInstance(Class<T> c) {

        if (instance == null) {
            synchronized (ValueObjectFactory.class) {
                if (instance == null) {
                    try {
                        instance = (ValueObject) Class.forName(c.getName()).getConstructor().newInstance();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return (T) instance;
    }
}
