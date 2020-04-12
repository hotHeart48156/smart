package org.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
/**
 * Spring Boot Starter
 * <p>
 * COLA framework initialization is configured in {@link org.product.config.ColaConfig}
 *
 * @author Frank Zhang
 */
@SpringBootApplication(
        scanBasePackages = {"org.product"})
@EnableResourceServer
@EnableCaching
@EnableOAuth2Client
public class Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
