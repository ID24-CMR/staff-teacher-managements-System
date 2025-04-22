package org.idrice24.services;

import org.idrice24.entities.Payroll;
import org.idrice24.repositories.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayrollServiceImpl implements PayrollService {
    private PayrollRepository payrollRepository;

    @Autowired
    public void setRepos(PayrollRepository payrollRepository){
        this.payrollRepository = payrollRepository;
    }

    @Override
    public Iterable<Payroll> getAllPayroll() {
        return payrollRepository.findAll();    
    }

    @Override
    public Payroll findById(long id) {
        return payrollRepository.findById(id);
    }

    @Override
    public void savePayroll(Payroll payroll) {
        payrollRepository.save(payroll);
    }

    @Override
    public void deletePayroll(Payroll payroll) {
        payrollRepository.delete(payroll);    
    }

    @Override
    public void deletePayrollById(long id) {
        payrollRepository.deleteById(id);
    }

}
