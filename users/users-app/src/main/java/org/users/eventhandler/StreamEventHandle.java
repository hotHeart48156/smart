package org.users.eventhandler;

import java.lang.annotation.*;

/**
 * @author "yangbiao"
 * types 对应 Stream 本身 Inuput 的类型，
 * payloadTypes 对应事件类型，
 * 比如 ContractCreated，我们要做的效果是这个 payloadTypes 可以不写，
 * 直接从方法的第一个参数读取 class 的 simapleName。
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface StreamEventHandle {
    String[] payloadTypes() default {""};

    String[] types();
}
