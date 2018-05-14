package com.hjy.springmvc.learn.ch11;

import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;

public class HjyHandlerMapping implements HandlerMapping {

    /*
    * 可参考SimpleUrlHandlerMapping
    * */

    @Override
    public HandlerExecutionChain getHandler(HttpServletRequest httpServletRequest) throws Exception {
        String url = httpServletRequest.getRequestURI().toString();
        String method = httpServletRequest.getMethod();

        if (url.startsWith("hjy")){
            if (method.equalsIgnoreCase("GET")){
                //return "hjy对应的Handler";
                return null;
            }else if (method.equalsIgnoreCase("POST")){
                return null;
            }else {
                return null;
            }
        }

        return null;
    }
}
