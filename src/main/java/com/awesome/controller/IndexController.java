package com.awesome.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨帆
 * @date 2018/7/17 17:36
 * @desc v1.0.0
 */
@RestController
@Slf4j
public class IndexController {

    @RequestMapping("/home")
    public String index() {
        return "Hello spring boot!";
    }
}
