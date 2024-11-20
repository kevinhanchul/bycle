package com.example.demo.controller;

import com.example.demo.service.LoginLimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class LoginLimitController {

    @Autowired
    private LoginLimitService loginLimitService;

    @GetMapping("/loginLimit")
    private ModelAndView loginLimit() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("loginLimit");
        return mav;
    }

    @PostMapping("/api/loginLimitPro")
    public Map<String, Object> loginLimitPro(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        return loginLimitService.loginLimitPro(paramMap);
    }
}
