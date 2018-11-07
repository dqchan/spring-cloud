package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    @RequestMapping("/getlist")
    public List<Map<String,Object>> getList(){
        Map<String,Object> map = new HashMap<>();
        map.put("key","value:2000");
        List list = new ArrayList();
        list.add(map);
        return list;
    }
}
