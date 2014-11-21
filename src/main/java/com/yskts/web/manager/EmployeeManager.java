package com.yskts.web.manager;

import com.yskts.web.dao.EmployeeDao;
import com.yskts.web.model.Employee;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Nick on 11/20/2014.
 */
@Component("employeeManager")
public class EmployeeManager {
    @Resource
    private EmployeeDao employeeDao;

    public Employee getEmployee(final Long employeeId) {
        return employeeDao.getEmployee(employeeId);
    }
}
