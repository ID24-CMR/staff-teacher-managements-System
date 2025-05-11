package org.idrice24.controllers;

import org.idrice24.entities.Department;
import org.idrice24.entities.Employee;
import org.idrice24.entities.Leave;
import org.idrice24.entities.Payroll;
import org.idrice24.entities.Salary;
import org.idrice24.services.DepartmentService;
import org.idrice24.services.EmployeeService;
import org.idrice24.services.LeaveService;
import org.idrice24.services.PayrollService;
import org.idrice24.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payroll")
public class PayrollController {
    private PayrollService payrollService;
    private EmployeeService employeeService;
    private DepartmentService departmentService;
    private SalaryService salaryService;
    private LeaveService leaveService;

    @Autowired
    public void setPayroll(PayrollService payrollService, EmployeeService employeeService,
    DepartmentService departmentService, SalaryService salaryService, LeaveService leaveService){
        this.payrollService = payrollService;
        this.departmentService = departmentService;
        this.employeeService = employeeService;
        this.leaveService = leaveService;
        this.salaryService = salaryService;
    }

    @GetMapping("/show")
    public String showPayroll(Model model){
        model.addAttribute("payrolls", model);
        Iterable<Payroll> payroll = payrollService.getAllPayroll();
        Iterable<Employee> employee = employeeService.getAllEmployee();
        Iterable<Department> department = departmentService.getAllDepartmen();
        Iterable<Salary> salary = salaryService.getAllSalary();
        Iterable<Leave> leave = leaveService.getAllLeaves();
        model.addAttribute("leaves", leave);
        model.addAttribute("salries", salary);
        model.addAttribute("departs", department);
        model.addAttribute("employees", employee);
        model.addAttribute("payrolls", payroll);
        
        return "add-payroll";
    }

    @GetMapping("show/list")
    public String listPayroll(Model model){
        Iterable<Payroll> payroll = payrollService.getAllPayroll();
        Iterable<Employee> employee = employeeService.getAllEmployee();
        Iterable<Department> department = departmentService.getAllDepartmen();
        Iterable<Salary> salary = salaryService.getAllSalary();
        Iterable<Leave> leave = leaveService.getAllLeaves();
        model.addAttribute("leaves", leave);
        model.addAttribute("salries", salary);
        model.addAttribute("departs", department);
        model.addAttribute("employees", employee);
        model.addAttribute("payrolls", payroll);
        return "payroll";
    }



}
