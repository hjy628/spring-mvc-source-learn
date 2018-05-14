package com.hjy.springmvc.learn.ch11;

import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HjyHandlerAdapter implements HandlerAdapter {
    /**
     *  参考SimpleControllerHandlerAdapter
     * */


    @Override
    public boolean supports(Object o) {
        return o instanceof HjyController;
    }

    @Override
    public ModelAndView handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return ((HjyController)o).hjy(httpServletRequest,httpServletResponse);
    }

    @Override
    public long getLastModified(HttpServletRequest httpServletRequest, Object o) {
        return -1L;
    }
}
