package com.smart.website.demo.commons.design.core.exception;


import com.smart.website.account.exception.framework.BaseException;
import com.smart.website.account.exception.framework.BasicErrorCode;

/**
 * System Exception is unexpected Exception, retry might work again
 *
 * @author Danny.Lee 2018/1/27
 */
public class SysException extends BaseException {

    private static final long serialVersionUID = 4355163994767354840L;

    public SysException(String errMessage) {
        super(errMessage);
        this.setErrCode(BasicErrorCode.SYS_ERROR);
    }


    public SysException(String errMessage, Throwable e) {
        super(errMessage, e);
        this.setErrCode(BasicErrorCode.SYS_ERROR);
    }


    public SysException(BasicErrorCode colaError, String s) {
        super(s);
    }
}
