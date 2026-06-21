package com.example.JUnitEx4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
        System.out.println("Setup executed");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown executed");
    }

    @Test
    void testDeposit() {

        // Arrange
        int amount = 500;

        // Act
        account.deposit(amount);

        // Assert
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdraw() {

        // Arrange
        int amount = 200;

        // Act
        account.withdraw(amount);

        // Assert
        assertEquals(800, account.getBalance());
    }
}