package com.gendlee.datashow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BarController {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String sayHello(){

        return "Hello Spring Boot!";

    }

    @RequestMapping("/bar1")
    public ModelAndView getBarOne() {
        return new ModelAndView("bar1");
    }
}
