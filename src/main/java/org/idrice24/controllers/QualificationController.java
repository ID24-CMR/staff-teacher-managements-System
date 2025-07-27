package org.idrice24.controllers;

import javax.validation.Valid;

import org.idrice24.entities.Qualify;
import org.idrice24.entities.Employee;
import org.idrice24.entities.Qualification;
import org.idrice24.services.QualifyService;
import org.idrice24.services.EmployeeService;
import org.idrice24.services.QualificationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/qualification")
public class QualificationController {
    private QualificationService qualificationService;
    private EmployeeService employeeService;
    private QualifyService qualifyService;

    @Autowired
    public void setQualification(QualificationService qualificationService, EmployeeService employeeService, QualifyService qualifyService){
        this.qualificationService = qualificationService;
        this.employeeService = employeeService;
        this.qualifyService = qualifyService;
    }

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("qualifying", new Qualification());
        Iterable<Qualify> qualify = qualifyService.getAllQualify();
        model.addAttribute("qualifys", qualify);
        return "add-qualification";
    }

    @GetMapping("/show/list")
    public String getQualification(Model model, Iterable<Qualification> qualify, Iterable<Employee> employee){
        qualify = qualificationService.getAllQualification();
        employee = employeeService.getAllEmployee();
        model.addAttribute("qualifies", qualify);
        model.addAttribute("employees", employee);

        return "qualified";
    }

    @PostMapping("/add/qualification")
    public String addQualified(@Valid Qualification qualification, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("qualifying", new Qualification());
            return "add-qualification";
        }
        qualificationService.saveQualification(qualification);
        model.addAttribute("qualifying", new Qualification());
        return "qualified";
    }


}
