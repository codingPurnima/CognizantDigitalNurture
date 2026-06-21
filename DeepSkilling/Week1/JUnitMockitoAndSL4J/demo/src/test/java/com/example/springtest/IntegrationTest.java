package com.example.springtest;

import com.example.springtest.model.User;
import com.example.springtest.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IntegrationTest {

    @Autowired
    UserRepository repository;

    @Test
    void testFullFlow() {
        User user = new User();
        user.setName("Integration User");

        User saved = repository.save(user);

        User found = repository.findById(saved.getId()).orElse(null);

        assertNotNull(found);
        assertEquals("Integration User", found.getName());
    }
}