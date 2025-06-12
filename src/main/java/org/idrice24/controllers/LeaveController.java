package org.idrice24.controllers;

import org.idrice24.services.LeaveService;
import org.idrice24.entities.Leave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.validation.Valid;
import org.idrice24.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
        Leave leave = new Leave();
        model.addAttribute("leaves", leave);
        return "add-leave";
    
    }

    @GetMapping("show/list")
    public String listLeave(Model model){
        Iterable<Leave> leave = leaveService.getAllLeaves();
        model.addAttribute("leaves", leave);
        return "leave";
    }


}
