package com.example.mockitotest.service;

import com.example.mockitotest.model.User;
import com.example.mockitotest.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

    private final UserRepository userRepository = mock(UserRepository.class);

    private final UserService userService = new UserService(userRepository);

    @Test
    void testGetUserById() {

        User user = new User();
        user.setId(1L);
        user.setName("Alice");

        when(userRepository.findById(1L))
                .thenReturn(Optional.of(user));

        User result = userService.getUserById(1L);

        assertNotNull(result);
        assertEquals("Alice", result.getName());

        verify(userRepository, times(1)).findById(1L);
    }
}