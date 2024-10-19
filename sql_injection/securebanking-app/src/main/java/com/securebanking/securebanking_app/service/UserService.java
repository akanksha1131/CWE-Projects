package com.securebanking.securebanking_app.service;

import com.securebanking.securebanking_app.model.User;
import com.securebanking.securebanking_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findUsersByName(String name) {
        return userRepository.findByName(name);
    }

    public List<User> searchUsersByEmail(String searchTerm) {
        return userRepository.findByEmailContaining(searchTerm);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
