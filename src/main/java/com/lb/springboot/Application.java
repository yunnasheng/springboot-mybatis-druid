package com.lb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lb.springboot.config.AppConfig;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		// 测试Logback打印配置
		AppConfig appConfig = ctx.getBean(AppConfig.class);
		appConfig.outprint();
	}

	/**
	 * 测试接口
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}
