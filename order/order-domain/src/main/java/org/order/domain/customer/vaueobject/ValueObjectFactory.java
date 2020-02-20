package org.order.domain.customer.vaueobject;

import java.lang.reflect.Field;

/**
 * @author "yangbiao"
 */
public class ValueObjectFactory {
    public static volatile ValueObject instance = null;

    public static <T extends ValueObject> ValueObject getInstance(Class<T> c, Object... value) {

        if (instance == null) {
            synchronized (ValueObjectFactory.class) {
                if (instance == null) {
                    try {
                        instance = (ValueObject) Class.forName(c.getName()).getConstructor().newInstance();
                        Field[] field = c.getDeclaredFields();
                        for (int i = 0; i < field.length; i++) {
                            field[i].setAccessible(true);
                            field[i].set(field[i], value[i]);

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return instance;
    }
}
