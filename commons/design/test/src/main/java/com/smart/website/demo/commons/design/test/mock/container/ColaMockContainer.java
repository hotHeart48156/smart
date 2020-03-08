package com.smart.website.demo.commons.design.test.mock.container;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.container;

import ${package}.mock.listener.DataRecordListener;
import ${package}.mock.listener.ColaNotifier;
import ${package}.mock.listener.ColaRunListener;
import ${package}.container.TestExecutor;
import ${package}.container.TestsContainer;

import org.springframework.context.ApplicationContext;

/**
 * 这是一个轻量级的TDD测试工具，可以敏捷的在开发过程中，运行测试，功能如下：
 * 1.测试单个方法，请在控制台输入方法全称
 *   例如：${package}.sales.service.test.CustomerServiceTest.testCheckConflict()
 * 2.测试整个测试类，请在控制台输入类全称
 *   例如：${package}.sales.service.test.CustomerServiceTest
 * 3.重复上一次测试，只需在控制台输入字母 - ‘r’
 *
 * @author shawnzhan.zxy
 *
 */
public class ColaMockContainer {

    public static void start(ApplicationContext context) {
        TestsContainer.init(context);
        TestExecutor testExecutor = TestsContainer.getTestExecutor();
        ColaNotifier colaNotifier = initColaNotifier();
        testExecutor.setNotifier(colaNotifier);
        TestsContainer.start();
    }

    public static void start() {
        start(null);
    }

    private static ColaNotifier initColaNotifier(){
        ColaNotifier colaNotifier = new ColaNotifier();
        colaNotifier.addListener(new DataRecordListener());
        colaNotifier.setColaRunListener(new ColaRunListener());
        return colaNotifier;
    }
}
