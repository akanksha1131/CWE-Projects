package com.securebanking.securebanking_app.repository;

import com.securebanking.securebanking_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
    List<User> findByEmailContaining(String searchTerm);
}
