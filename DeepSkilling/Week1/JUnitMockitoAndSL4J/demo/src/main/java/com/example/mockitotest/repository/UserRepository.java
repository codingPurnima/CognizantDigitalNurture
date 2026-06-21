package com.example.mockitotest.repository;

import com.example.mockitotest.model.User;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);
}