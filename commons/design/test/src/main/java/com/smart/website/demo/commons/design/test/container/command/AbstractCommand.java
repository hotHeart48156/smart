package com.smart.website.demo.commons.design.test.container.command;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.lang3.StringUtils;
import org.mockito.internal.util.StringUtil;

/**
 * @author shawnzhan.zxy
 * @date 2019/03/19
 */
public abstract class AbstractCommand {
    private static CommandLineParser parser  = new GnuParser();
    protected static AbstractCommand curCmd;
    protected static AbstractCommand preCmd;

    protected String cmdRaw;
    private Map<String, Object> params;
    private Options options;
    private CommandLine commandLine;

    public AbstractCommand(String cmdRaw){
        this.cmdRaw = cmdRaw.replaceAll(" +", StringUtils.SPACE);

        params = new HashMap<>();
        options = new Options();
        initParser(options);
        commandLine = parse();
    }

    public void execute(){
        System.out.println("===Run start==== "+cmdRaw);
        action();
        System.out.println("===Run end====${symbol_escape}n");
    }

    /**
     * 清理当前命令的上下文
     */
    protected void cleanContext(){}

    protected void initParser(Options options){};

    protected abstract void action();

    public CommandLine parse(){
        try {
            return parser.parse(options, cmdRaw.split(org.apache.commons.lang3.StringUtils.SPACE));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object getParam(String key){
        return params.get(key);
    }

    public void putParam(String key, Object value){
        params.put(key, value);
    }

    public String getStringParam(String key){
        Object value = params.get(key);
        if(value == null){
            return org.apache.commons.lang3.StringUtils.EMPTY;
        }
        return value.toString();
    }

    public boolean isEclipseMethod(String input) {
        return input.indexOf("(") > 0 ;
    }

    public boolean isIdeaMethod(String input) {
        return input.indexOf("${symbol_pound}") > 0 ;
    }

    public CommandLine getCommandLine() {
        return commandLine;
    }

    public static AbstractCommand createCmd(String cmdRaw){
        if(org.apache.commons.lang3.StringUtils.isBlank(cmdRaw)){
            return null;
        }

        AbstractCommand command = null;
        if(cmdRaw.startsWith(CommandEnum.TestClassCreateCmd.getCmd() + org.apache.commons.lang3.StringUtils.SPACE)){
            command = new TestClassCreateCmd(cmdRaw);
        }else if(cmdRaw.matches(CommandEnum.TestMethodRunCmd.getDesc())){
            command = new TestMethodRunCmd(cmdRaw);
        }else if(cmdRaw.startsWith(CommandEnum.OnlineRecordCmd.getCmd())){
            command = new OnlineRecordCommand(cmdRaw);
        }else if(cmdRaw.matches(CommandEnum.TestClassRunCmd.getDesc())){
            command = new TestClassRunCmd(cmdRaw);
        }else if(cmdRaw.matches(CommandEnum.GuideCmd.getDesc())){
            command = new GuideCmd(cmdRaw);
        }

        if(command != null){
            preCmd = curCmd;
            curCmd = command;
        }
        if(preCmd != null){
            preCmd.cleanContext();
        }

        return command;
    }

}
