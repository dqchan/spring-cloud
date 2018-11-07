package com.example.controller;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getlist")
    public String getList(){
        String url = "http://order-server/getlist";
        JSONObject json = restTemplate.getForEntity(url, JSONObject.class).getBody();
        return json.toJSONString();
    }
}
