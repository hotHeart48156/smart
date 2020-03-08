package com.smart.website.demo.commons.design.test.mock.utils;#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.utils;

/**
 * @author shawnzhan.zxy
 * @date 2018/09/12
 */
public class Constants {
    public final static String VERSION  = "1.0.0";
    public final static String RESPONSE_DATA_DELIMITER = "===";
    public final static String RESPONSE_METHOD_DELIMITER = "---";
    public final static String SERVICE_LIST_DELIMITER = "_@_";
    public final static String UNDERLINE = "_";
    public final static String DOT = ".";
    /** 入参文件后缀*/
    public final static String INPUT_PARAMS_FILE_SUFFIX = "_inputParams";
    /** colamock 代理标识*/
    public final static String COLAMOCK_PROXY_FLAG = "ByColaMockWithCGLIB";
    public final static String INNER_BEAN_NAME = "inner bean";
    public final static String NOTE_SYMBOL = "${symbol_pound}";


    public final static String METHOD_PARAM_DELIMITER = "=================method_params_separator================";
    public final static String PARAM_PARAM_DELIMITER = "=========param_params_separator=========";
    public final static String METHOD_METHOD_DELIMITER = "=======================different_method_separator=============================";

    /** colamockconfig格式化模板*/
    public final static String COLAMOCKCONFIG_TEMPLATE = "@ColaMockConfig(mocks={${symbol_dollar}{mocks}}"
        + "<${symbol_pound}if dataManufactures !=''>, dataManufactures={${symbol_dollar}{dataManufactures}}</${symbol_pound}if>)";

    public final static String AGENT_NEW_METHOD_TEMPALTE =
        "{ "
            + "${symbol_dollar}{beforeCode} "
            + "<${symbol_pound}if isReturn>Object result = </${symbol_pound}if> ${symbol_dollar}{renamedMethodName}(${symbol_dollar}${symbol_dollar}); "
            + "${symbol_dollar}{afterCode} "
            + "<${symbol_pound}if isReturn>return result;</${symbol_pound}if>"
    + "}";

    public final static String DATA_CURSOR_DESC = "curIndex %s params %s ";

    /** 返回类型*/
    public static final String RETURN_TYPE_VOID = "void";

    /** 帮助手册*/
    public static final String HELP_MANUAL_URL = "https://www.atatech.org/articles/121826";


    public static final String GUIDE_HELP = "h";
    public static final String GUIDE_REPEAT = "r";
    public static final String GUIDE_QUIT = "q";

    public static final String OS_WINDOWS = "Windows";
}