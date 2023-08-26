package com.cypersoft.demospringboot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @ = Anotaion : định nghĩa đường dẫn
* @controller: định nghĩa đường dẫn nhưng phải trả giao diện html
* @ResponseBody: trả nội dung kiểu String
* @RestController: định nghĩa đường dẫn, nội dung trả String (chuyên dùng viết API)
*
*
*
* */
@RestController
@RequestMapping("/hello")
public class helloController {
    @GetMapping("")
    public String hello() {
        return "hello Spring boot";
    }

    @GetMapping("/cypersoft")
    public String helloCypersoft() {
        return "Hello cybersoft";
    }
};
