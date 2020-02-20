package org.activite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Starter
 * <p>
 * COLA framework initialization is configured in {@link org.activite.config.ColaConfig}
 *
 * @author Frank Zhang
 */
@SpringBootApplication(scanBasePackages = {"org.activite", "com.alibaba.cola"})
@MapperScan("org.activite.repository")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
