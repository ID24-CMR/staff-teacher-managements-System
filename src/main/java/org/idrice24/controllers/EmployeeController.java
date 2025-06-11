package org.idrice24.controllers;

import org.idrice24.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.idrice24.entities.Employee;

import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee/")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public void setEmployee(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("show")
    public String showEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employees", employee);
        return "add-employee";
    }

    @GetMapping("show/list")
    public String listEmployee(Model model){
        Iterable<Employee> employee = employeeService.getAllEmployee();
        model.addAttribute("employees", employee);
        return "employee";
    }

    @PostMapping("add/employee")
    public String newEmployee(@Valid Employee employee, BindingResult result, Model model){
        if(result.hasErrors()){
            return "add-employee";
        }
        employeeService.saveEmployee(employee);
        Iterable<Employee> employees = employeeService.getAllEmployee();
        model.addAttribute("employees", employees);
        return "employee";
    }

    @GetMapping("view/employee/{id}")
    public String viewEmployee(@PathVariable("id") long id, Model model, Employee employee){
        employee = employeeService.findById(id);

        model.addAttribute("employee", employee);

        return "employeeview";
    }

}
