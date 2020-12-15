package com.lb.springboot.config.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


/**
 * <p>
 * {@code @Component 将此类当做为Component组件被其他地方使用}
 * </p>
 * 
 * <p>{@code @ConfigurationProperties(prefix = "spring.datasource") 
 * 该注解会查找application.properties内以spring.datasource开头的配置项，并赋值到本class内同名的属性
 * 例如：driverClassName、url、username 等}
 * 
 * @author lb
 *
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource")
@PropertySource("classpath:druid.properties")
@Getter
@Setter
public class DruidDataSourceProperties {

	/**
	 * 驱动名称，从application.properties获取值
	 */
	private String driverClassName;
	private String url;
	private String username;
	private String password;

	/**
	 * 连接池初始化大小，从/src/main/resources/druid.properties获取值
	 */
	@Value("${druid.initialSize}")
	private int initialSize;
	
	@Value("${druid.minIdle}")
	private int minIdle;
	
	@Value("${druid.maxActive}")
	private int maxActive;
	
	@Value("${druid.timeBetweenEvictionRunsMillis}")
	private long timeBetweenEvictionRunsMillis;
	
	@Value("${druid.minEvictableIdleTimeMillis}")
	private long minEvictableIdleTimeMillis;
	
	@Value("${druid.validationQuery}")
	private String validationQuery;
	
	@Value("${druid.testWhileIdle}")
	private boolean testWhileIdle;
	
	@Value("${druid.testOnBorrow}")
	private boolean testOnBorrow;
	
	@Value("${druid.testOnReturn}")
	private boolean testOnReturn;
	
	@Value("${druid.poolPreparedStatements}")
	private boolean poolPreparedStatements;
	
	@Value("${druid.maxPoolPreparedStatementPerConnectionSize}")
	private int maxPoolPreparedStatementPerConnectionSize;
	
	@Value("${druid.filters}")
	private String filters;
	
	@Value("${druid.connectionProperties}")
	private String connectionProperties;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
		return new PropertySourcesPlaceholderConfigurer();
	}
}