/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yskts.web.controller;

import com.yskts.web.constant.MvcConstants.Index;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for Index view.
 * 
 * @author niwong
 */
@Controller
public class IndexController {
    private static final String GREETING = "Spring Bootstrap";
    
    /**
     * Get method for Index view.
     * 
     * @param model
     * @return 
     */
    @RequestMapping(value = Index.URL, method = RequestMethod.GET)
    public String doGet(Model model) {
        
        model.addAttribute(Index.Model.GREETING, GREETING);
        return Index.VIEW;
    }
}
