package com.yskts.web.controller;

import com.yskts.web.constant.MvcConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for simple Hello World view. 
 * 
 * @author nwong
 * @since 3/29/13
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = MvcConstants.HelloWorld.URL, method = RequestMethod.GET)
    public String doGet() {

        return MvcConstants.HelloWorld.VIEW;
    }
}