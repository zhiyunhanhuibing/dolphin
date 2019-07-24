package com.zhiyun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author hanhuibing
 * @Date 2019/7/23
 * @Version V1.0
 **/
@RestController
@RequestMapping("/demo")
    public class TestZuul {
    @GetMapping("/hello")
    public String hello(String name) {
        return "hi," + name + ",this is zuul api! ";
    }
}
