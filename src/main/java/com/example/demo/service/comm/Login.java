package com.example.demo.service.comm;

import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class Login {
    public String chkId(Map<String, Object> paramMap){

        return "Y";
    }

    public String chkLoginLimit(Map<String, Object> paramMap){

        return "Y";
    }
}
