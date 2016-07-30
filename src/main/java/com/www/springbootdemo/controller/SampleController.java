/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.www.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类SampleController
 *
 * @author sunzanmei
 * @since 2016-07-27.
 */
@Controller
public class SampleController {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
