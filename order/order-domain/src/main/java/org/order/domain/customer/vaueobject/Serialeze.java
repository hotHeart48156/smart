package org.order.domain.customer.vaueobject;

import com.google.gson.Gson;

import java.nio.channels.ClosedSelectorException;

/**
 * @author "yangbiao"
 */
public class Serialeze {
    private static Gson gson = new Gson();

    public static <T extends ValueObject> String toJson(T t) {
        return gson.toJson(t);

    }

    public static <T extends ValueObject> ValueObject toValueObject(String json, Class<ValueObject> t) {
        return gson.fromJson(json, t);
    }
}
