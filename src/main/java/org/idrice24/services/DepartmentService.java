package org.idrice24.services;


import org.idrice24.entities.Department;

public interface DepartmentService {

    public void saveDepart(Department department);

    public Iterable<Department> listAllDepartment();

}
