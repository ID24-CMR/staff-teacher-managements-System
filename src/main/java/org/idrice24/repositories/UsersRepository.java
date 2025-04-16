package org.idrice24.repositories;

import java.util.Optional;

import org.idrice24.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
    Optional<Users> findById(long id);
}
