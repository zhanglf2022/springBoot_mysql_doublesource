package com.zhanglf.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
/**
 * 配置除去了自动配置数据源的类-DataSourceAutoConfiguration，因为
 * 这个注解会把sping的配置的数据源全部都自动注入，不会默认注入一个，当使用其他数据源时再调用另外的数据源。
 * @author Administrator
 *
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
