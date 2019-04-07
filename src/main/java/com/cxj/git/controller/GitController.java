package com.cxj.git.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: cuixiaojian
 * Date: 2019/4/7 9:31
 *
 * @Description：
 */
@RestController
public class GitController {

    @RequestMapping("/git")
    public String gitTest(){
        return "hello git...";
    }
}
