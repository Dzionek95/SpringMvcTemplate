package com.dzionek.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Bartlomiej Janik
 * @since 9/30/2017
 */
@Controller
public class HelloWorld {

    @RequestMapping("/")
    public ModelAndView sayHello(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("msg","Spring MVC Template");
        return modelAndView;
    }

}

