package com.cnzv.wenjun.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenshen
 * @version 1.0
 * @date 2020/4/13 10:58
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String demo() {
        return "Hello docker";
    }
}
