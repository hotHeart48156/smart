package org.users;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Spring Boot Starter
 * <p>
 * COLA framework initialization is configured in {@link org.users.config.ColaConfig}
 *
 * @author Frank Zhang
 */
@SpringBootApplication(scanBasePackages = {"org.users", "com.alibaba.cola"})
@MapperScan("org.users.repository")
@Slf4j
@EnableJpaRepositories
@Enable
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
