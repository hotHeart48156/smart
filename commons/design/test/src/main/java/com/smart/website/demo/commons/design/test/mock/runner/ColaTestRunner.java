package com.smart.website.demo.commons.design.test.mock.runner;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.runner;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import ${package}.mock.listener.IntegrateTestListener;
import ${package}.mock.model.ColaTestDescription;
import ${package}.mock.spring.ColaContextLoader;
import ${package}.mock.utils.reflection.BeanPropertySetter;
import com.alibaba.fastjson.parser.ParserConfig;
import ${package}.mock.ColaMockito;
import ${package}.mock.annotation.ColaBefore;
import ${package}.mock.listener.UnitTestListener;

import org.junit.internal.runners.model.ReflectiveC${parentArtifactId}able;
import org.junit.internal.runners.statements.Fail;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.springframework.test.annotation.ProfileValueUtils;
import org.springframework.test.context.MergedContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.statements.RunBeforeTestMethodC${parentArtifactId}backs;
import org.springframework.test.context.support.DefaultTestContext;

/**
 * @author shawnzhan.zxy
 * @date 2018/09/02
 */
public class ColaTestRunner extends SpringJUnit4ClassRunner{
    public static AtomicBoolean init = new AtomicBoolean(false);

    /**
     * Construct a new {@code SpringJUnit4ClassRunner} and initialize a
     * {@link } to provide Spring testing functionality to
     * standard JUnit tests.
     *
     * @param clazz the test class to be run
     * @see ${symbol_pound}createTestContextManager(Class)
     */
    public ColaTestRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }

    protected Object createTest(Description description) throws Exception {
        assembleContextLoader();
        Object testInstance = super.createTest();
        ColaTestDescription colaTestDescription = new ColaTestDescription(testInstance, description);
        ColaMockito.g().initMock(colaTestDescription);
        return testInstance;
    }

    @Override
    protected Statement methodBlock(FrameworkMethod frameworkMethod) {
        Object testInstance;
        try {
            testInstance = new ReflectiveC${parentArtifactId}able() {
                @Override
                protected Object runReflectiveC${parentArtifactId}() throws Throwable {
                    Description description = describeChild(frameworkMethod);
                    return createTest(description);
                }
            }.run();
        }
        catch (Throwable ex) {
            return new Fail(ex);
        }

        Statement statement = methodInvoker(frameworkMethod, testInstance);
        statement = possiblyExpectingExceptions(frameworkMethod, testInstance, statement);
        statement = withBefores(frameworkMethod, testInstance, statement);
        if(!ColaMockito.g().getContext().isRecording()) {
            statement = withColaBefores(frameworkMethod, testInstance, statement);
            statement = new RunBeforeTestMethodC${parentArtifactId}backs(statement, testInstance, frameworkMethod.getMethod(),
                getTestContextManager());
        }
        statement = withAfters(frameworkMethod, testInstance, statement);
        //statement = withRulesReflectively(frameworkMethod, testInstance, statement);
        statement = withPotentialRepeat(frameworkMethod, testInstance, statement);
        statement = withPotentialTimeout(frameworkMethod, testInstance, statement);
        return statement;
    }

    /**
     * Check whether the test is enabled in the current execution environment.
     * <p>This prevents classes with a non-matching {@code @IfProfileValue}
     * annotation from running altogether, even skipping the execution of
     * {@code prepareTestInstance()} methods in {@code TestExecutionListeners}.
     * @see ProfileValueUtils${symbol_pound}isTestEnabledInThisEnvironment(Class)
     * @see org.springframework.test.annotation.IfProfileValue
     * @see org.springframework.test.context.TestExecutionListener
     */
    @Override
    public void run(RunNotifier notifier) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        addColaUnitTestListener(notifier);
        super.run(notifier);
    }

    protected Statement withColaBefores(FrameworkMethod method, Object target,
                                        Statement statement) {
        List<FrameworkMethod> befores = getTestClass().getAnnotatedMethods(
            ColaBefore.class);
        return befores.isEmpty() ? statement : new RunBefores(statement,
            befores, target);
    }

    private void addColaUnitTestListener(RunNotifier notifier){
        if(ColaTestUnitRunner.init.compareAndSet(false, true)){
            notifier.addListener(ColaTestUnitRunner.colaUnitTestListener);
        }
    }

    private void assembleContextLoader(){
        BeanPropertySetter beanProperty = new BeanPropertySetter(getTestContextManager().getTestContext(), "mergedContextConfiguration");
        MergedContextConfiguration mergedContextConfiguration = beanProperty.getValue();
        beanProperty = new BeanPropertySetter(mergedContextConfiguration, "contextLoader");
        beanProperty.setValue(new ColaContextLoader());
    }
}
