package com.guigu.web;

import com.guigu.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class HomeController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/home")
    public String home() {
        return "Hello world ,port:" + port;
    }

    @RequestMapping("/get")
    public String getPatam(Integer id) {
        System.err.println("ProviderApplication===id==="+id);
        return "Hello world ,port:" + port;
    }

    @RequestMapping("/post")
    public User postPatam(@RequestBody User user) {
        System.err.println("ProviderApplication===user==="+user);
        User freestyle = new User(1,"freestyle", 32);
        return freestyle;
    }

    @RequestMapping("/getInfo")
    public User getUserInfo(String name,Integer age){
        User user = new User(11,name, age);
        System.err.println("ProviderApplication===user==="+user);
        return user;
    }
}
