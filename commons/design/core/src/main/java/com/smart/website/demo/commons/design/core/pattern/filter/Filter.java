package com.smart.website.demo.commons.design.core.pattern.filter;


/**
 *
 */
public interface Filter<T> {

    void doFilter(T context, FilterInvoker nextFilter);

}