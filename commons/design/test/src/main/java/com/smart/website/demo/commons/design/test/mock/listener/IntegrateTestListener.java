package com.smart.website.demo.commons.design.test.mock.listener;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.listener;

import java.util.HashSet;

import ${package}.mock.ColaMockito;
import ${package}.mock.utils.SpyHelper;

import org.junit.runner.Description;
import org.junit.runner.Result;

/**
 * @author shawnzhan.zxy
 * @date 2019/02/19
 */
public class IntegrateTestListener extends UnitTestListener{
    SpyHelper spyHelper;

    @Override
    public void testStarted(Description description) throws Exception {
        spyHelper = new SpyHelper(description.getTestClass(), ColaMockito.g().getContext().getTestInstance());
        spyHelper.processInject4Test(new HashSet<>());
        super.testStarted(description);
    }

    @Override
    public void testFinished(Description description) throws Exception {
        spyHelper.resetTest();
        super.testFinished(description);
    }
}
