package org.idrice24.services;

import org.idrice24.entities.Employee;

public interface EmployeeService {
    Iterable<Employee>  getAllEmployee();
    Employee findById(long id);

    void saveEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void deleteEmployeeById(long id);
}
