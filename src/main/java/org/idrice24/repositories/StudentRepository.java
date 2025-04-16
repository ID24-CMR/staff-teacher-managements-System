package org.idrice24.repositories;


import java.util.List;

//import org.idrice24.entities.Classe;
import org.idrice24.entities.Student;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findById(long id);

    List<Student> findByClasse(String classe);

}
