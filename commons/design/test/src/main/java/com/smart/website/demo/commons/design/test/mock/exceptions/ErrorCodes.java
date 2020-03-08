package com.smart.website.demo.commons.design.test.mock.exceptions;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.exceptions;

import ${package}.mock.utils.Constants;

/**
 * @author shawnzhan.zxy
 * @date 2019/02/20
 */
public enum ErrorCodes {
    INDEX_OUT_OF_BOUNDS("INDEX_OUT_OF_BOUNDS", "数组越界"),
    HAS_REMAIN_DATA("HAS_REMAIN_DATA", "数据没有被使用完,请检查原逻辑路径是否被覆盖完全"),

    ;

    private String code;
    private String desc;

    ErrorCodes(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String toString(){
        return "ERR[" + code + "] " + Constants.HELP_MANUAL_URL;
    }
}
