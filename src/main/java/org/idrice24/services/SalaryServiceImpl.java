package org.idrice24.services;

import org.idrice24.entities.Salary;
import org.idrice24.repositories.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {
    private SalaryRepository salaryRepository;

    @Autowired
    public void setSalary(SalaryRepository salaryRepository){
        this.salaryRepository = salaryRepository;
    }
    @Override
    public Iterable<Salary> getAllSalary() {
        return salaryRepository.findAll();
    }

    @Override
    public Salary findById(long id) {
        return salaryRepository.findById(id);
    }

    @Override
    public void saveSalary(Salary salary) {
        salaryRepository.save(salary);
    }

    @Override
    public void deleteSalary(Salary salary) {
     salaryRepository.delete(salary);
    }

    @Override
    public void deleteSalaryById(long id) {
       salaryRepository.deleteById(id);
    }

}
