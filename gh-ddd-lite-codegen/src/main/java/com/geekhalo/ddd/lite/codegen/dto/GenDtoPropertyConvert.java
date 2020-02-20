package com.geekhalo.ddd.lite.codegen.dto;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GenDtoPropertyConvert {
    GenDtoPropertyModel value();
}
