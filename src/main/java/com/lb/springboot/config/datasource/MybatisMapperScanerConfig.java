package com.lb.springboot.config.datasource;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 
 * mybatis的扫描
 * 
 * <p>
 * {@code @AutoConfigureAfter 的作用是，在初始化MybatisDataSourceConfig.class后在初始化本类}
 * </p>
 * 
 * @author lb
 *
 */
@Component
@AutoConfigureAfter(MybatisDataSourceConfig.class)
public class MybatisMapperScanerConfig {
	
	@Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        configurer.setBasePackage("com.lb.springboot.mapper");
        return configurer;
    }

}
