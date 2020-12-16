package com.lb.springboot.config.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author lb
 */
@Configuration
@MapperScan(basePackages = "com.lb.springboot.mapper")
public class MybatisMapperScannerConfig {


}
