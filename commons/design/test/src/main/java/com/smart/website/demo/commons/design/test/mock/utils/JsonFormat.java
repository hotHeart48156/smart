package com.smart.website.demo.commons.design.test.mock.utils;#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.utils;

/**
 * @author shawnzhan.zxy
 * @date 2018/09/12
 */
public class JsonFormat {
    public static String format(String jsonStr) {
        int level = 0;
        StringBuffer jsonForMatStr = new StringBuffer();
        for (int i = 0; i < jsonStr.length(); i++) {
            char c = jsonStr.charAt(i);
            if (level > 0 && '${symbol_escape}n' == jsonForMatStr.charAt(jsonForMatStr.length() - 1)) {
                jsonForMatStr.append(getLevelStr(level));
            }
            switch (c) {
                case '{':
                case '[':
                    jsonForMatStr.append(c + "${symbol_escape}n");
                    level++;
                    break;
                case ',':
                    jsonForMatStr.append(c + "${symbol_escape}n");
                    break;
                case '}':
                case ']':
                    jsonForMatStr.append("${symbol_escape}n");
                    level--;
                    jsonForMatStr.append(getLevelStr(level));
                    jsonForMatStr.append(c);
                    break;
                default:
                    jsonForMatStr.append(c);
                    break;
            }
        }
        return jsonForMatStr.toString();
    }

    private static String getLevelStr(int level) {
        StringBuffer levelStr = new StringBuffer();
        for (int levelI = 0; levelI < level; levelI++) {
            levelStr.append("${symbol_escape}t");
        }
        return levelStr.toString();

    }
}
