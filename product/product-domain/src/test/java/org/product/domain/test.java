package org.product.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Embeddable;
import java.io.File;
import java.lang.reflect.Field;

/**
 * @author "yangbiao"
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
public class test {
    @Test
    public void te() {
        System.out.println(org.product.domain.aggragate.test.class.getResource("").getPath());
        System.out.println(org.product.domain.aggragate.test.class.getResource("/org/product/domain/aggragate"));
        File file = new File("C:\\Users\\OMEN\\eclipse-workspace\\demo\\product\\product-domain\\src\\main\\java\\org\\product\\domain\\aggragate\\");
        System.out.println(file.isDirectory());

        Class c = this.getClass();
        System.out.println(c.getName());
        for (Field field : c.getFields()) {
            System.out.println(field.getName());
        }

    }
}
