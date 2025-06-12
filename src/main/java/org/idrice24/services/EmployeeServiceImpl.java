package org.idrice24.services;

import org.idrice24.entities.Employee;
import org.idrice24.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployee(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Iterable<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(long id) {
       return employeeRepository.findById(id);
    }

    @Override
    public void saveEmployee(Employee employee) {
       employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }

}
