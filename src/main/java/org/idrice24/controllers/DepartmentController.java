package org.idrice24.controllers;

import org.idrice24.services.DepartmentService;
import org.springframework.stereotype.Controller;


import org.idrice24.entities.Department;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/department/")
public class DepartmentController {
    private DepartmentService departmentService;

    @Autowired
    public void setDepartment(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

@GetMapping("show")
public String showDept(Model model){
    Department depart = new Department();
    model.addAttribute("departs", depart);
    return "add-department";
}

@GetMapping("show/list")
public String listDepart(Model model){
    Iterable<Department> depart = departmentService.getAllDepartmen();
    model.addAttribute("departs", depart );
    return "department";

}

@PostMapping("add/department")
public String newDepart(@Valid Department department, BindingResult result, Model model){
    if(result.hasErrors()){
        return "add-department";
    }
    departmentService.saveDepartment(department);
    Iterable<Department> depart = departmentService.getAllDepartmen();
    model.addAttribute("departs", depart);
    return "department";
}

@GetMapping("view/depart/{id}")
public String viewDepartment(@PathVariable("id") long id, Model model, Department department){
    department = departmentService.findById(id);
    model.addAttribute("departs", department);
    return "department";
}

    @GetMapping("delete")
    public String deleteDepartment(){
        return "department";
    }
}
