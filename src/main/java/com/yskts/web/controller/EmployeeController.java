package com.yskts.web.controller;

import com.yskts.web.constant.MvcConstants;
import com.yskts.web.manager.EmployeeManager;
import com.yskts.web.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.ws.rs.PathParam;

/**
 * Controller for simple Hello World view. 
 * 
 * @author nwong
 * @since 3/29/13
 */
@Controller
public class EmployeeController {

    @Resource
    private EmployeeManager employeeManager;

    @RequestMapping(value = MvcConstants.Employee.URL, method = RequestMethod.GET)
    @ResponseBody
    public Employee doGet(
            @PathParam("employeeId") final Long employeeId
    ) {
        final Employee employee = employeeManager.getEmployee(employeeId);
        return employee;
    }
}
