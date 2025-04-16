package org.idrice24.services;

import org.idrice24.entities.Department;
import org.idrice24.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;
    @Autowired
    public void setDepartService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }


    @Override
    public void saveDepart(Department department){
        departmentRepository.save(department);
    }


    @Override
    public Iterable<Department> listAllDepartment() {
        return departmentRepository.findAll();
        
    }
}
