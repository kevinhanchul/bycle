package com.example.demo.controller;

import com.example.demo.service.HighChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class HighChoiceController {

    @Autowired
    private HighChoiceService highChoiceService;

    @GetMapping("/highChoice")
    private ModelAndView highChoice() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("highChoice");
        return mav;
    }

    @PostMapping("/api/highSeller")
    public Map<String, Object> highSeller(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        Map<String, Object> highSellerMap = highChoiceService.highSeller(paramMap);
        paramMap.put("highSellerMap", highSellerMap);

        return highChoiceService.highSeller(paramMap);
    }

}
