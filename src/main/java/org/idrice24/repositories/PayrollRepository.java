package org.idrice24.repositories;

import org.idrice24.entities.Payroll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepository extends CrudRepository<Payroll, Long>  {
    Payroll findById(long id);
}
