package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/22/15:26
 * @Description:
 */
@Configuration
@ComponentScan({"com.itheima.service","com.itheima.dao"})
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
