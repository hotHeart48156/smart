package com.smart.website.demo.commons.design.test.mock.agent.model;

/**
 * @author shawnzhan.zxy
 * @date 2019/04/30
 */
public enum TranslateType {
    DEFAULT_CONSTRUCTOR("DEFAULT_CONSTRUCTOR"),
    ONLINE_RECORD("ONLINE_RECORD"),

    ;

    private String type;

    TranslateType(String type){
        this.type = type;
    }
}
