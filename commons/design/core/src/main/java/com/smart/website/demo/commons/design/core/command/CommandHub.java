package com.smart.website.demo.commons.design.core.command;

import com.smart.website.account.exception.framework.ColaException;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Command Hub holds ${parentArtifactId} the important information about Command
 *
 * @author fulan.zjf 2017-10-24
 */
@SuppressWarnings("rawtypes")
@Component
@Data
public class CommandHub {


    /**
     * 全局通用的PreInterceptors
     */
    private List<CommandInterceptorI> globalPreInterceptors = new ArrayList<>();

    /**
     * 全局通用的PostInterceptors
     */
    private List<CommandInterceptorI> globalPostInterceptors = new ArrayList<>();

    private Map<Class/*CommandClz*/, CommandInvocation> commandRepository = new HashMap<>();


    /**
     * This Repository is used for return right response type on exception scenarios
     */
    private Map<Class/*CommandClz*/, Class/*ResponseClz*/> responseRepository = new HashMap<>();

    public CommandInvocation getCommandInvocation(Class cmdClass) {
        CommandInvocation commandInvocation = commandRepository.get(cmdClass);
        if (commandRepository.get(cmdClass) == null)
            throw new ColaException(cmdClass + " is not registered in CommandHub, please register first");
        return commandInvocation;
    }
}
