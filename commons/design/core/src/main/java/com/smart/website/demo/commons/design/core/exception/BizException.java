package com.smart.website.demo.commons.design.core.exception;

import com.smart.website.account.exception.framework.BaseException;
import com.smart.website.account.exception.framework.BasicErrorCode;
import com.smart.website.accout.commons.dto.ErrorCodeI;

/**
 * BizException is known Exception, no need retry
 */
public class BizException extends BaseException {

    private static final long serialVersionUID = 1L;

    public BizException(String errMessage) {
        super(errMessage);
        this.setErrCode(BasicErrorCode.BIZ_ERROR);
    }

    public BizException(ErrorCodeI errCode, String errMessage) {
        super(errMessage);
    }

    public BizException(String errMessage, Throwable e) {
        super(errMessage, e);
        this.setErrCode(BasicErrorCode.BIZ_ERROR);
    }
}