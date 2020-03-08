package com.smart.website.demo.commons.design.test.container.command;
/**
 * @author shawnzhan.zxy
 * @date 2019/03/19
 */
public enum CommandEnum {
    TestClassCreateCmd("new", ""),
    TestMethodSegRecordCmd("record", ""),
    TestMethodRunCmd("", "[^${symbol_escape}${symbol_escape}s]*[${symbol_escape}${symbol_escape}(${symbol_pound}].*"),
    TestClassRunCmd("", "(${symbol_escape}${symbol_escape}w+${symbol_escape}${symbol_escape}.${symbol_escape}${symbol_escape}w+){1,}"),
    GuideCmd("", "^[rhq]${symbol_dollar}"),
    OnlineRecordCmd("online", ""),
    ;

    private String cmd;
    private String desc;

    CommandEnum(String cmd, String desc){
        this.cmd = cmd;
        this.desc = desc;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
