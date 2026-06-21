package com.example.springtest;

import com.example.springtest.service.UserService;
import com.example.springtest.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceExceptionTest {

    @Test
    void testUserNotFound() {
        UserRepository repo = Mockito.mock(UserRepository.class);
        Mockito.when(repo.findById(1L)).thenReturn(Optional.empty());

        UserService service = new UserService(repo);

        assertThrows(NoSuchElementException.class,
                () -> service.getUserById(1L));
    }
}