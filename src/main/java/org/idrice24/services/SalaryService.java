package org.idrice24.services;

import org.idrice24.entities.Salary;

public interface SalaryService {
    Iterable<Salary> getAllSalary();
    Salary findById(long id);

    void saveSalary(Salary salary);
    void deleteSalary(Salary salary);
    void deleteSalaryById(long id);
}
