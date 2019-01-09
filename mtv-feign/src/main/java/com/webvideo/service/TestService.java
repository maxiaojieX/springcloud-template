package com.webvideo.service;

import com.webvideo.service.impl.TestServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by xiaojie.Ma on 2019/1/9.
 */
@FeignClient(name = "mtv-server",fallback = TestServiceImpl.class)
public interface TestService {

    @GetMapping("/test")
    Map test();

}
