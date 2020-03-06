package org.order.executor.command;

import lombok.AllArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotNull;

/**
 * @author "yangbiao"
 */
@Value
@AllArgsConstructor
public class AddBillMessageCommand {
    @NotNull
    private String billType;

    @NotNull
    private String billContent;

    @NotNull
    private String billHead;


}