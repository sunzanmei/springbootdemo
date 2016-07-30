/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.www.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 类Application
 * 通常定义在根包
 * @author sunzanmei
 * @since 2016-07-30.
 */
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class Application {

    public static void main(String[] args) throws Exception {
        //启动默认使用8080端口,改变端口需要继承EmbeddedServletContainerCustomizer
        SpringApplication.run(Application.class, args);
    }
}
