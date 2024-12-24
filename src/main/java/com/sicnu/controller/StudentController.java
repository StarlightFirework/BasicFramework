package com.sicnu.controller;

import com.sicnu.pojo.ResponseResult;
import com.sicnu.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class StudentController {

    @Autowired
    JwtUtil jwtUtil;
    @GetMapping
    public ResponseResult getText() throws Exception {
        Map<String,Object> claims = new HashMap<>();
        claims.put("name","刘镇涛");
        claims.put("age",12);
        String jwt =  jwtUtil.createToken(claims);
        return ResponseResult.success(jwt);
    }
}
