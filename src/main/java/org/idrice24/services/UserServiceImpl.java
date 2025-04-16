package org.idrice24.services;

import java.util.Optional;

import org.idrice24.entities.Users;
import org.idrice24.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices {
    private UsersRepository usersRepository;
    @Autowired
    public void setUserRepo(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @Override
    public Iterable<Users> getAllUsers() {
        return usersRepository.findAll();    
    }

    @Override
    public Optional<Users> getUserById(long id) {
        return usersRepository.findById(id);
    }

    @Override
    public void saveUser(Users user) {
       usersRepository.save(user);
    }

    @Override
    public void deleteUser(Users user) {
        usersRepository.delete(user);
    }

    @Override
    public Optional<Users> editUserById(long id) {
        return usersRepository.findById(id);
    }

}
