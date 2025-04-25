package org.idrice24.services;

import org.idrice24.entities.Payroll;

public interface PayrollService {
    Iterable<Payroll> getAllPayroll();
    Payroll findById(long id);

    void savePayroll(Payroll payroll);
    void deletePayroll(Payroll payroll);
    void deletePayrollById(long id);
}
