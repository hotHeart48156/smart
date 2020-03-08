package com.smart.website.demo.commons.design.core.exception.framework;

import com.smart.website.accout.commons.dto.ErrorCodeI;

/**
 * Base Exception is the parent of ${parentArtifactId} exceptions
 *
 * @author fulan.zjf 2017年10月22日 上午12:00:39
 */
public abstract class BaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private ErrorCodeI errCode;

    public BaseException(String errMessage) {
        super(errMessage);
    }

    public BaseException(String errMessage, Throwable e) {
        super(errMessage, e);
    }

    public ErrorCodeI getErrCode() {
        return errCode;
    }

    public void setErrCode(BasicErrorCode errCode) {
        this.errCode = errCode;
    }

}
