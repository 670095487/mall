package com.mall.mall01.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @date 2023/02/05
 */
@Configuration
@MapperScan("com.mall.mbg.mapper")
public class MyBatisConfig {


}
