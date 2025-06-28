package com.codes.springboot_codes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    // Setup: runs before each test
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator initialized");
    }

    // Teardown: runs after each test
    @AfterEach
    public void tearDown() {
        System.out.println("Teardown: Test completed\n");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testAdditionWithZero() {
        // Arrange
        int a = 0;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(5, result);
    }
}
