package org.product.domain.aggragate;

import java.io.File;
import java.lang.reflect.Field;

public class test {
    public static void main(String[] args) {
        System.out.println(test.class.getResource("").getPath());
        System.out.println(test.class.getResource("/org/product/domain/aggragate"));
        File file = new File("C:\\Users\\OMEN\\eclipse-workspace\\demo\\product\\product-domain\\src\\main\\java\\org\\product\\domain\\aggragate\\");
        System.out.println(file.isDirectory());

        Class c = new test().getClass();
        System.out.println(c.getName());
        for (Field field : c.getFields()) {
            System.out.println(field.getName());
        }

    }

}