/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.www.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

/**
 * 类BootStart
 *
 * @author sunzanmei
 * @since 2016-07-27.
 */

@SpringBootApplication //@Configuration+@EnableAutoConfiguartion+@ComponentScan
public class BootStart implements EmbeddedServletContainerCustomizer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootStart.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8086);
    }
}
