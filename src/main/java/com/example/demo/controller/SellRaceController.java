package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SellRaceController {

    @GetMapping("/sellRace")
    private ModelAndView sellRace() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sellRace");
        return mav;
    }
}
