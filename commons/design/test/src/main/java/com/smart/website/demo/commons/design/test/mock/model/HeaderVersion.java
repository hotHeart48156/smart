package com.smart.website.demo.commons.design.test.mock.model;#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.model;

/**
 * @author shawnzhan.zxy
 * @date 2018/12/15
 */
public class HeaderVersion {
    String version;
    /** 是否初始化*/
    Boolean initialized;

    public HeaderVersion(){}

    public HeaderVersion(String version){
        this.version = version;
    }

    public HeaderVersion(String version, Boolean initialized){
        this.version = version;
        this.initialized = initialized;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getInitialized() {
        return initialized;
    }

    public void setInitialized(Boolean initialized) {
        this.initialized = initialized;
    }
}
