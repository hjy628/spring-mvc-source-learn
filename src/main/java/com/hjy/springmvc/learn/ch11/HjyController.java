package com.hjy.springmvc.learn.ch11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("hjy")
public class HjyController {

    public ModelAndView hjy(HttpServletRequest request, HttpServletResponse response){


        return new ModelAndView("hjy");
    }


}
