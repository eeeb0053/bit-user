package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.domains.UserDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/users")
    public Map<String, String> join(@RequestBody UserDTO user){
        Map<String, String> map = new HashMap<>();
        List list = new ArrayList();
        List<String> list2 = new ArrayList<>();
        System.out.println("아이디: "+user.getUserId());
        System.out.println("비밀번호: "+user.getPassword());
        System.out.println("이름: "+user.getName());
        map.put("name", user.getName());
        return map;
    }
}
