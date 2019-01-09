package com.webvideo.controller;

import com.webvideo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by xiaojie.Ma on 2019/1/9.
 */
@Controller
public class FeignTestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/feign/test")
    @ResponseBody
    public Map test() {
        System.out.println("###################feign done##################");
        return testService.test();
    }

}
