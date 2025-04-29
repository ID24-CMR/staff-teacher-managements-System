package org.idrice24.controllers;

import javax.validation.Valid;

import org.idrice24.entities.Department;
import org.idrice24.entities.Salary;
import org.idrice24.services.DepartmentService;
import org.idrice24.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Salary/")
public class SalaryController {
    private SalaryService salaryService;
    private DepartmentService departmentService;

    @Autowired
    public void setSalary(SalaryService salaryService, DepartmentService departmentService){
        this.salaryService = salaryService;
        this.departmentService = departmentService;
    }

    @GetMapping("show")
    public String getSalary(Model model){
        Iterable<Department> dept;
        dept = departmentService.getAllDepartmen();
        model.addAttribute("depts", dept);
        model.addAttribute("salary", model);
        return "add-salary";
    }

    @GetMapping("show/list")
    public String listSalary(Model model){
        Iterable<Salary> salary = salaryService.getAllSalary();
        model.addAttribute("salaries", salary);
        return "salary";
    }

    @PostMapping("add")
    public String addSalary(@Valid Salary salary, BindingResult result, Model model){
        if(result.hasErrors()){
            return "add-salary";
        }
        salaryService.saveSalary(salary);
        Iterable<Salary> salaries = salaryService.getAllSalary();
        model.addAttribute("salaries", salaries);
        return "salary";
    }
}
