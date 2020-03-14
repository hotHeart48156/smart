package org.product.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author "yangbiao"
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
public class Auto {

    @Test
    public void te() {
        System.out.println(this.getClass().getResource("/"));
    }

}
