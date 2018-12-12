package com.zhanglf.cn.datasource.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 指定对应mapper包用哪个sqlSessionTemplate.
 * @author Administrator
 *
 */
@Configuration
@MapperScan(basePackages="com.zhanglf.cn.mapper.first.mapper",sqlSessionTemplateRef="mysqlFirstTemplate")
public class MySqlFirstConfig {

	@Resource(name="mysqlFirstDataSource")
	private DataSource mysqlFirstDataSource;
	
	@Bean(name="mysqlFirstSqlSessionFactory")
	public SqlSessionFactory firstSqlSessionFactory(){
		SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
		bean.setDataSource(mysqlFirstDataSource);
		try {
			return bean.getObject();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Bean(name="mysqlFirstTemplate")
	public SqlSessionTemplate template(){
		return new SqlSessionTemplate(firstSqlSessionFactory());
	}
	
	
}
