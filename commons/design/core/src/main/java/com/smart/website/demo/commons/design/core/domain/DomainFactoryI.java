package com.smart.website.demo.commons.design.core.domain;

/**
 * 领域工厂
 *
 * @author xueliang.sxl
 */
public interface DomainFactoryI<T extends EntityObject> {

    T create();

}
