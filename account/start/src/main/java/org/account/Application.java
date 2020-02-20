package org.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Starter
 * <p>
 * COLA framework initialization is configured in {@link org.account.config.ColaConfig}
 *
 * @author Frank Zhang
 */
@SpringBootApplication(scanBasePackages = {"org.account", "com.alibaba.cola"})
@MapperScan("org.account.repository")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
