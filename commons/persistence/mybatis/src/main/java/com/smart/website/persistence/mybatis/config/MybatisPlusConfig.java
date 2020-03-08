/*
 * *************************************************************************
 *   Copyright (c) 2018-2025, dreamlu.net All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the dreamlu.net developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: chunmeng.lu (qq596392912@gmail.com)
 * *************************************************************************
 */

package com.smart.website.persistence.mybatis.config;

import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.smart.website.persistence.configuration.PersistenceConfiguration;
import com.smart.website.persistence.mybatis.injector.MicaSqlInjector;
import com.smart.website.persistence.mybatis.plugins.SqlLogInterceptor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.EnumTypeHandler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * MybatisPlus配置
 *
 * @author L.cm
 */
@Configuration
@Accessors(chain = true, fluent = true)
@AllArgsConstructor
public class MybatisPlusConfig extends BaseConfiguration implements PersistenceConfiguration {

	/**
	 * mybatis-plus分页插件
	 */
	@Bean
	@ConditionalOnMissingBean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

	/**
	 * sql 注入
	 */
	@Bean
	public ISqlInjector sqlInjector() {
		return new MicaSqlInjector();
	}

	/**
	 * sql 日志
	 */
	@Bean
	@ConditionalOnProperty(value = "mica.mybatis-plus.sql-log.enable", matchIfMissing = true)
	public SqlLogInterceptor sqlLogInterceptor() {
		return new SqlLogInterceptor();
	}

	/**
	 * IEnum 枚举配置
	 */
	@Bean
	public ConfigurationCustomizer configurationCustomizer() {
		return new MybatisPlusCustomizers();
	}

	/**
	 * 自定义配置
	 */
	public static class MybatisPlusCustomizers implements ConfigurationCustomizer {


		public void customize(MybatisConfiguration configuration) {
			configuration.setDefaultEnumTypeHandler(EnumTypeHandler.class);
		}

		@Override
		public void customize(org.apache.ibatis.session.Configuration configuration) {
			configuration.setDefaultEnumTypeHandler(EnumTypeHandler.class);

		}
	}

}
