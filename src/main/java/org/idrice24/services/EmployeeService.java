package org.idrice24.services;

import java.io.IOException;
import java.nio.file.Path;

import org.idrice24.entities.Employee;
import org.springframework.web.multipart.MultipartFile;

public interface EmployeeService {
    Iterable<Employee>  getAllEmployee();
    Employee findById(long id);

    void saveEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void deleteEmployeeById(long id);

    Employee saveImage(MultipartFile file) throws IOException;
    Path getImagePath(long id);
}
