package com.raphael.workshopmongo.services;

import com.raphael.workshopmongo.domain.User;
import com.raphael.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll (){
        return repository.findAll();
    }
}
