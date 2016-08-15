package com.sise.controller;

import com.sise.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rola on 16-8-15.
 */

@Controller
@RequestMapping("/test")
public class HelloController {

    @Autowired
    private TestService testService;

    @RequestMapping("hello")
    public String testHello() {

        return "my page";
    }

}
