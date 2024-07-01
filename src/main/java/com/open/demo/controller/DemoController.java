package com.open.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoty
 * @since 2024/7/1 8:56
 */

@RestController
public class DemoController {


    @RequestMapping("hello")
    public String hello() {
        return "hello world!!!";
    }
}
