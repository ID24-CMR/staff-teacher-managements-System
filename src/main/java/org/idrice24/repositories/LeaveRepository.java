package org.idrice24.repositories;


import org.idrice24.entities.Leave;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepository extends CrudRepository<Leave, Long>{
    Leave findById(long id);
}
