package com.github.hollykunge.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//todo:部署到云雀系统时要释放开
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author: zhhongyu
 * @description: 任务管理启动类
 * @since: Create in 9:37 2019/8/27
 */
@SpringBootApplication
//todo:部署到云雀系统时要释放开
//@EnableDiscoveryClient
//@EnableEurekaClient
//@EnableFeignClients
@MapperScan(basePackages = "com.github.hollykunge.security.mapper")
public class ServiceTaskBootstrap {
    public static void main(String[] args) {
       SpringApplication.run(ServiceTaskBootstrap.class, args);
    }
}
