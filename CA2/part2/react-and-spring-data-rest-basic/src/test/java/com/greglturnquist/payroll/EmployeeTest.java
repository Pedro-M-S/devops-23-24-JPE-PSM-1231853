package com.greglturnquist.payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    String firstName;
    String lastName;
    String description;
    Employee employee;

    @BeforeEach
    void setUp() {
        firstName = "Frodo";
        lastName = "Baggins";
        description = "An hobbit";
        employee = new Employee(firstName, lastName, description);
        employee.setId(1L);
    }

    @Test
    void setGetId() {
        // Arrange
        Long newId = 5L;

        // Act
        employee.setId(newId);
        Long result = employee.getId();

        // Assert
        assertEquals(newId, result);
    }

    @Test
    void setGetFirstName() {
        // Arrange
        String newFirstName = "Sam";

        // Act
        employee.setFirstName(newFirstName);
        String result = employee.getFirstName();

        // Assert
        assertEquals(newFirstName, result);
    }

    @Test
    void setGetLastName() {
        // Arrange
        String newLastName = "Gamgee";

        // Act
        employee.setLastName(newLastName);
        String result = employee.getLastName();

        // Assert
        assertEquals(newLastName, result);
    }

    @Test
    void setGetDescription() {
        // Arrange
        String newDescription = "A gardener";

        // Act
        employee.setDescription(newDescription);
        String result = employee.getDescription();

        // Assert
        assertEquals(newDescription, result);
    }
}
