package org.idrice24.services;

import java.util.Optional;

import org.idrice24.entities.Users;

public interface UserServices {
    Iterable<Users> getAllUsers();
    Optional<Users> getUserById(long id);
    void saveUser(Users user);
    void deleteUser(Users user);
    Optional<Users> editUserById(long id);
}
