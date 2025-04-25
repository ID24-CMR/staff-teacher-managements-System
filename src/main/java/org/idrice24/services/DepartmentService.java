package org.idrice24.services;

import org.idrice24.entities.Department;

public interface DepartmentService {
    Iterable<Department> getAllDepartmen();
    Department findById(long id);

    void saveDepartment(Department department);
    void deleteDepartment(Department department);
    void deleteDepartmentById(long id);
}
