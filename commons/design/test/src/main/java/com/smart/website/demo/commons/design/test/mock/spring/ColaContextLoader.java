package com.smart.website.demo.commons.design.test.mock.spring;

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mock.spring;

import ${package}.mock.utils.reflection.BeanPropertySetter;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.MergedContextConfiguration;
import org.springframework.test.context.support.GenericXmlContextLoader;

/**
 * @author shawnzhan.zxy
 * @date 2019/04/25
 */
public class ColaContextLoader extends GenericXmlContextLoader {

    /**
     * Prepare the {@link GenericApplicationContext} created by this {@code ContextLoader}.
     * C${parentArtifactId}ed <i>before</i> bean definitions are read.
     *
     * <p>The default implementation is empty. Can be overridden in subclasses to
     * customize {@code GenericApplicationContext}'s standard settings.
     *
     * @param context the context that should be prepared
     * @see ${symbol_pound}loadContext(MergedContextConfiguration)
     * @see ${symbol_pound}loadContext(String...)
     * @see GenericApplicationContext${symbol_pound}setAllowBeanDefinitionOverriding
     * @see GenericApplicationContext${symbol_pound}setResourceLoader
     * @see GenericApplicationContext${symbol_pound}setId
     * @see ${symbol_pound}prepareContext(ConfigurableApplicationContext, MergedContextConfiguration)
     * @since 2.5
     */
    @Override
    protected void prepareContext(GenericApplicationContext context) {
        BeanPropertySetter setter = new BeanPropertySetter(context, "beanFactory");
        setter.setValue(new ColaBeanFactory());
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        beanFactory.setInstantiationStrategy(new ColaBeanInstantiationStrategy());

        //GenericBeanDefinition definition = new GenericBeanDefinition();
        //definition.getConstructorArgumentValues().addGenericArgumentValue("com.alibaba.crm.marketing");
        //definition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_NO);
        //definition.setBeanClass(ColaMockController.class);
        //definition.setScope("");
        //definition.setLazyInit(false);
        //definition.setAutowireCandidate(true);
        //beanFactory.registerBeanDefinition("colaMockController", definition);
    }

    @Override
    protected BeanDefinitionReader createBeanDefinitionReader(GenericApplicationContext context) {
        return new ColaBeanDefinitionReader(context);
    }
}
