package com.example.demo.controller;

import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    private ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    //로그인 처리
    @PostMapping("/api/loginPro")
    public Map<String, Object> loginPro(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        return loginService.loginPro(paramMap);
    }
}
