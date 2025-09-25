package com.codegym.service.impl;

import com.codegym.model.User;
import com.codegym.repository.IUserRepository;
import com.codegym.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository IUserRepository;

    @Override
    public Iterable<User> findAll() {
       return  IUserRepository.findAll();
    }

    @Override
    public void save(User user) {
        IUserRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return  IUserRepository.findById(id);
    }

    @Override
    public void remove(Long id) {

    }
}
