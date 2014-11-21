package com.yskts.web.dao;

import com.yskts.web.model.Employee;
import org.springframework.stereotype.Component;

/**
 * Created by Nick on 11/20/2014.
 */
@Component("employeeDao")
public class EmployeeDao {
    public Employee getEmployee(final Long employeeId) {
        return new Employee("Tom");
    }
}
