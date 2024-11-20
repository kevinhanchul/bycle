package com.example.demo.service.comm;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Member {
    public String chkStop(Map<String, Object> paramMap){

        return "Y";
    }
}
