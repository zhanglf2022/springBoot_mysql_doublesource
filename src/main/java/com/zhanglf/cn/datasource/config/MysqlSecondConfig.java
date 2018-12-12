package com.zhanglf.cn.datasource.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.zhanglf.cn.mapper.second.mapper", sqlSessionTemplateRef = "mysqlSecondSqlSessionTemplate")
public class MysqlSecondConfig {

	@Resource(name = "mysqlSecondDataSource")
	private DataSource mysqlSecondDataSource;

	@Bean(name="mysqlSecondSqlSessionFactory")
	public SqlSessionFactory secondSqlSessionFacory() {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(mysqlSecondDataSource);
		try {
			return bean.getObject();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Bean(name="mysqlSecondSqlSessionTemplate")
	public SqlSessionTemplate template() {
		return new SqlSessionTemplate(secondSqlSessionFacory());
	}

}
