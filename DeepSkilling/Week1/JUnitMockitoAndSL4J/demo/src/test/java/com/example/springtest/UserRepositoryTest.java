package com.example.springtest;

import com.example.springtest.model.User;
import com.example.springtest.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    void testFindByName() {
        User user = new User();
        user.setName("John");
        repository.save(user);

        List<User> users = repository.findByName("John");

        assertFalse(users.isEmpty());
    }
}