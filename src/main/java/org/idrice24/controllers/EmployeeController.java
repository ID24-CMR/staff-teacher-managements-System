package org.idrice24.controllers;

import org.idrice24.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;


import org.idrice24.entities.Employee;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.*;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

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
    public String newEmployee(@RequestParam("file") MultipartFile file, @Valid Employee employee, BindingResult result, Model model) throws IOException{
        if(result.hasErrors()){
            return "add-employee";
        }
        employeeService.saveEmployee(employee);
        employeeService.saveImage(file);
        Iterable<Employee> employees = employeeService.getAllEmployee();
        model.addAttribute("employees", employees);
        return "employee";
    }

    @GetMapping("view/employee/{id}")
    public String viewEmployee(@PathVariable("id") long id, Model model, Employee employees) throws MalformedURLException{
        employees = employeeService.findById(id);
        Path imagePath = employeeService.getImagePath(id);
        if(imagePath == null || ! Files.exists(imagePath)){
            return ResponseEntityExceptionHandler.PAGE_NOT_FOUND_LOG_CATEGORY;
        }
        Resource resource = new UrlResource(imagePath.toUri());
        ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(resource);

        model.addAttribute("employee", employees);

        return "employeeview";
    }

}
