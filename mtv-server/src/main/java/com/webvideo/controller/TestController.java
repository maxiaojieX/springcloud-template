package com.webvideo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaojie.Ma on 2019/1/9.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public Map test() {
        Map<String,String> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","success");
        return map;
    }

}
