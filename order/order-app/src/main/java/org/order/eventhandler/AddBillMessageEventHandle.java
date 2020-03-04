package org.order.eventhandler;

import lombok.AllArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotNull;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class AddBillMessageEventHandle {
    @NotNull
    private String billType;

    @NotNull
    private String billContent;

    @NotNull
    private String billHead;


}
