package com.smart.website.demo.commons.design.core.extension;


import java.lang.annotation.*;

/**
 * Extension
 *
 * @author fulan.zjf 2017-11-05
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Component
public @interface Extension {
    String bizId() default BizScenario.DEFAULT_BIZ_ID;

    String useCase() default BizScenario.DEFAULT_USE_CASE;

    String scenario() default BizScenario.DEFAULT_SCENARIO;
}
