package org.idrice24.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.idrice24.entities.Employee;
import org.idrice24.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

    // @Value("${upload.dir}")
    // private String uploadDir;

    // public  Employee saveImage(MultipartFile file) throws IOException {
    //    // String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
    //     Path path = Paths.get(uploadDir);

    //     Files.createDirectories(path.getParent());
    //     Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

    //     Employee image = new Employee();
    //     image.setFilePath(path);

    //     return employeeRepository.save(image);
    // }

    // /*getting the image path */
    // public Path getImagePath(long id){
    //     Employee image = employeeRepository.findById(id);
    //     return image != null ? Paths.get(image.getFilePath()) : null;
    // }

}
