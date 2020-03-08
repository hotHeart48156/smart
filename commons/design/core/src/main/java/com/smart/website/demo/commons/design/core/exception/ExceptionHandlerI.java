package com.smart.website.demo.commons.design.core.exception;

import com.smart.website.account.command.Command;
import com.smart.website.accout.commons.dto.Response;


/**
 * ExceptionHandlerI provide a backdoor that Application can override the default Exception handling
 *
 * @author Frank Zhang
 * @date 2019-01-02 11:25 PM
 */
public interface ExceptionHandlerI {
    void handleException(Command cmd, Response response, Exception exception);
}
