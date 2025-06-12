package org.idrice24.services;

import org.idrice24.entities.Department;
import org.idrice24.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    @Autowired
    public void serDepartment(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Iterable<Department> getAllDepartmen() {
        return departmentRepository.findAll();    
    }

    @Override
    public Department findById(long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public void saveDepartment(Department department) {
      departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(Department department) {
        departmentRepository.delete(department);    
    }

    @Override
    public void deleteDepartmentById(long id) {
        departmentRepository.deleteById(id);
    }

}
