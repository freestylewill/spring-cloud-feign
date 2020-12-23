package com.guigu.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述: 指定这个接口所要调用的 提供者服务名称 "eureka-provider"
 *
 * @author yanpenglei
 * @create 2017-12-06 15:13
 **/
@FeignClient("eureka-provider")
@RequestMapping("/feign")
public interface HomeClient extends ApiClient {

//    @GetMapping("/home")
//    String consumer();
//
//    @GetMapping("/get")
//    String getPatam(@RequestParam("id")Integer id);
//
//    @PostMapping("/post")
//    User postPatam(@RequestBody User user);

    @GetMapping("/getInfo")
    String getUserInfo(@RequestParam("name") String name, @RequestParam("age") Integer age);
}
