package com.geekhalo.ddd.lite.domain;

import com.querydsl.core.annotations.QueryEmbeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by taoli on 17/11/17.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@QueryEmbeddable
public class BusinessException extends RuntimeException {
    private final Integer code;
    private final String msg;


    public BusinessException(Integer code, String message) {
        this.code = code;
        this.msg = message;
    }

    public BusinessException(Integer code, String message, Throwable throwable) {
        super(throwable);
        this.code = code;
        this.msg = message;
    }

}
