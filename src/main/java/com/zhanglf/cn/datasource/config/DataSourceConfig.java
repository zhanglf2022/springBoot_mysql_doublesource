package com.zhanglf.cn.datasource.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

	@Bean
	@ConfigurationProperties("spring.datasource.mysqlFirst")
	public DataSourceProperties mysqlFirstDataSourceProperties(){
		return new DataSourceProperties();
	}
	
	@Bean
	@ConfigurationProperties("spring.datasource.mysqlFirst")
	public DataSource mysqlFirstDataSource(){
		return mysqlFirstDataSourceProperties().initializeDataSourceBuilder().build();
	}
	
	@Bean
	@ConfigurationProperties("spring.datasource.mysqlSecond")
	public DataSource mysqlSecondDataSource(){
		return DataSourceBuilder.create().build();
	}
	
}
