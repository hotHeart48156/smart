package com.smart.website.demo.commons.design.test.mock.runner;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.runner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import ${package}.mock.ColaMockito;
import ${package}.mock.model.ColaTestDescription;
import ${package}.mock.model.MockServiceModel;

import org.mockito.InjectMocks;
import org.mockito.MockSettings;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.MockUtil;

import static org.mockito.Mockito.withSettings;

/**
 * @author shawnzhan.zxy
 * @date 2019/01/04
 */
public class IntegrateColaTest extends AbstractColaTest {

    public IntegrateColaTest(ColaMockito colaMockito) {
        super(colaMockito);
    }
}
