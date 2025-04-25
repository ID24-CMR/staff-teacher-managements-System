package org.idrice24.controllers;

import org.idrice24.services.DepartmentService;
import org.springframework.stereotype.Controller;

@Controller
public class DepartmentController {
    private DepartmentService departmentService;

    public void setDepartment(DepartmentService departmentService){
        this.departmentService = departmentService;
    }
}
