package com.webvideo.service.impl;

import com.webvideo.service.TestService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaojie.Ma on 2019/1/9.
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public Map test() {
        Map<String,String> map = new HashMap<>();
        map.put("code","500");
        map.put("msg","请重试");
        return map;
    }
}
