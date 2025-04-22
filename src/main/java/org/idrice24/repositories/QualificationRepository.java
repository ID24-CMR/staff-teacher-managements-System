package org.idrice24.repositories;

import org.idrice24.entities.Qualification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface QualificationRepository extends CrudRepository<Qualification, Long> {

}
