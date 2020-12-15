package com.lb.springboot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * 应用自定义配置
 * @author lb
 *
 */
@Configuration
@ComponentScan(value = {"com.lb.springboot.**"})
@PropertySource("classpath:application-myconfig.properties")
public class AppConfig {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AppConfig.class);

	@Value("${server.port}")
	private String serverPort;
	
	public void outprint() {
		LOGGER.info("logback - 加载配置 - serverPort: {}",serverPort);
	}
}