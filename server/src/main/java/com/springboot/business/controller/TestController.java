package com.springboot.business.controller;


import com.alibaba.fastjson.JSONObject;
import com.springboot.business.impl.HelloWorldImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private HelloWorldImpl helloWorld;

    @GetMapping("helloWorld")
    public JSONObject helloWorld(String message){
        String value = helloWorld.printHelloworld();
        JSONObject json = new JSONObject();
        json.put("key",value);
        return json;
    }

    @GetMapping("upload")
    public void uploadFile(MultipartFile file){
        System.out.println(1);
        return;
    }

}
