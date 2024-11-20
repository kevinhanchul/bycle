package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MatchPlayer {
    @GetMapping("/matchPlayer")
    private ModelAndView matchPlayer() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("matchPlayer");
        return mav;
    }
}
