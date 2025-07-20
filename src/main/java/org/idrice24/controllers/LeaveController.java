package org.idrice24.controllers;

import org.idrice24.services.LeaveService;
import org.idrice24.entities.Leave;
import org.idrice24.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.idrice24.services.EmployeeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;


@Controller
@RequestMapping("/leave/")
public class LeaveController {
    private LeaveService leaveService;
    private EmployeeService employeeService;

    @Autowired
    public void setLeave(LeaveService leaveService, EmployeeService employeeService){
        this.leaveService = leaveService;
        this.employeeService = employeeService;
    }

    @GetMapping("show")
    public String showLeave(Model model){
        Leave leaves = new Leave();
        model.addAttribute("leaves", leaves);
        return "add-leave";
    
    }
 
    @GetMapping("shows")
    @ResponseBody
    public Iterable<Employee> getAllEmployees(){
         return employeeService.getAllEmployee();
    }

    @GetMapping("show/list")
    public String listLeave(Model model){
        Iterable<Leave> leave = leaveService.getAllLeaves();
        model.addAttribute("leaves", leave);
        return "leave";
    }

    @PostMapping("add/leave")
    public String addLeaves(@Valid Leave leave, BindingResult result, Model model){

        if(result.hasErrors()){
            return "add-leave";
        }
        leaveService.saveLeave(leave);
        Iterable<Leave> leaves = leaveService.getAllLeaves();
        model.addAttribute("leaves", leaves);
        return "leave";
    }


}
