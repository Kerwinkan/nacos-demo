package com.atguigu.nacosconsumer.feign;/*
@author kankan
@create 2019-10-28 18:38
*/

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-provider")
public interface ProviderFeign {

    @GetMapping("provider/hello")
    public String hello();
}
