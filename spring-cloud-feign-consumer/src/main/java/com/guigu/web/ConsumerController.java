package com.guigu.web;

import com.guigu.api.HomeClient;
import com.guigu.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:调用提供者的 `home` 方法
 *
 * @author yanpenglei
 * @create 2017-12-06 15:26
 **/
@RestController
public class ConsumerController {

    @Autowired
    private HomeClient homeClient;

    @GetMapping(value = "/hello")
    public String hello() {
        return  homeClient.consumer();
    }

    @GetMapping(value = "/get")
    public String getHello() {
        Double dataDouble = Math.random() * 100;
        int data = (int) Math.round(dataDouble);
        System.err.println("data==="+data);
        return  homeClient.getPatam(data);
    }

    @GetMapping(value = "/post")
    public String postHello() {
        User mayun = new User(22,"mayun", 52);
        System.err.println("mayun==="+mayun);
        User user = homeClient.postPatam(mayun);
        System.err.println("user==="+user);
        return  "true";
    }

    @GetMapping(value = "/info")
    public String getInfo() {
//        User mayun = new User("mayun", 52);
//        System.err.println("mayun==="+mayun);
        String majun = homeClient.getUserInfo("majun", 33);
        System.err.println("majun==="+majun);
        return  "true";
    }
}
