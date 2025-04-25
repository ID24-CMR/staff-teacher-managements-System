package org.idrice24.controllers;

import org.idrice24.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public void setEmployee(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

}
