package com.example.springtest;

import com.example.springtest.model.User;
import com.example.springtest.repository.UserRepository;
import com.example.springtest.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserRepository repo = Mockito.mock(UserRepository.class);
    UserService service = new UserService(repo);

    @Test
    void testGetUserById() {
        User user = new User(1L, "John");

        Mockito.when(repo.findById(1L)).thenReturn(Optional.of(user));

        User result = service.getUserById(1L);

        assertEquals("John", result.getName());
    }
}