package org.idrice24.controllers;

import org.idrice24.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;


import org.idrice24.entities.Employee;

import java.io.IOException;
import java.net.MalformedURLException;
import java.io.File;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
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


    @Value("${upload.dir}")
    private String uploadDir;

    @PostMapping("add/employee")
    public String newEmployee(@RequestParam("profile") MultipartFile file,
    
    @RequestParam("fname") String fname,
    @RequestParam("lname") String lname,
    @RequestParam("age") int age, @Valid Employee employee, BindingResult result, Model model) throws IOException{

        Employee employees = new Employee();
        // if(result.hasErrors()){
        //     model.addAttribute("employees", employees);
        //     return "add-employee";
        // }
        
        employee.setFname(fname);
        employee.setLname(lname);
        employee.setAge(age);
        employee.setProfile(file.getBytes());

        // //save file in a local folder (uploads)
        // uploadDir = "uploads";
        // File directory = new File(uploadDir);
        // if(!directory.exists()){
        //     directory.mkdirs();
        // }

        // String filePath = uploadDir + File.separator + file.getOriginalFilename();
        // File destination = new File(filePath);
        // file.transferTo(destination);

        if(file.isEmpty()){
            System.out.println("this file is empty "+file.getOriginalFilename());
        }else{
            employeeService.saveEmployee(employee);
        }
        


        model.addAttribute("employees", employees);
        return "redirect:/employee/show/list";
    }

    @GetMapping("view/{empId}")
    public String viewEmployee(@PathVariable("empId") Long empId, Model model, Employee employees) throws MalformedURLException{
         employees = employeeService.findById(empId);
        
            byte[] imageDate = employees.getProfile();


    
         model.addAttribute("employee", employees);
        

        return "viewEmployee";
    }

}
