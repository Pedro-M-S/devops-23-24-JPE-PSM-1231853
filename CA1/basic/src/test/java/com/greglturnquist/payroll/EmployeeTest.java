package com.greglturnquist.payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    String firstName;
    String lastName;
    String description;
    String jobTitle;
    Integer jobYears;
    Employee employee;

    @BeforeEach
    void setUp() {
        firstName = "Frodo";
        lastName = "Baggins";
        description = "An hobbit";
        jobTitle = "Ring bearer";
        jobYears = 3;
        employee = new Employee(firstName, lastName, description, jobTitle, jobYears);
        employee.setId(1L);
    }

    @Test
    void testConstructorInvalidFirstNameNull() {
        // Arrange
        String invalidFirstName = null;

        // Act - Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(invalidFirstName, lastName, description, jobTitle, jobYears));
    }

    @Test
    void testConstructorInvalidFirstNameEmpty() {
        // Arrange
        String invalidFirstName = " ";

        // Act - Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(invalidFirstName, lastName, description, jobTitle, jobYears));
    }

    @Test
    void testConstructorInvalidLastNameNull() {
        // Arrange
        String invalidLastName = null;

        // Act - Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(firstName, invalidLastName, description, jobTitle, jobYears));
    }

    @Test
    void testConstructorInvalidLastNameEmpty() {
        // Arrange
        String invalidFirstName = " ";

        // Act - Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(firstName, invalidFirstName, description, jobTitle, jobYears));
    }

    @Test
    void testConstructorInvalidDescriptionNull() {
        // Arrange
        String invalidDescription = null;

        // Act - Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(firstName, lastName, invalidDescription, jobTitle, jobYears));
    }

    @Test
    void testConstructorInvalidDescriptionEmpty() {
        // Arrange
        String invalidDescription = " ";

        // Act - Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(firstName, lastName, invalidDescription, jobTitle, jobYears));
    }

    @Test
    void testConstructorInvalidJobTitleNull() {
        // Arrange
        String invalidJobTile = null;

        // Act - Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(firstName, lastName, description, invalidJobTile, jobYears));
    }

    @Test
    void testConstructorInvalidJobTitleEmpty() {
        // Arrange
        String invalidJobTitle = " ";

        // Act - Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(firstName, lastName, description, invalidJobTitle, jobYears));
    }

    @Test
    void testConstructorInvalidJobYearsNull() {
        // Arrange
        Integer invalidJobYears = null;

        // Act - Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(firstName, lastName, description, jobTitle, invalidJobYears));
    }

    @Test
    void testConstructorInvalidJobYearsNegativeValue() {
        // Arrange
        Integer invalidJobYears = -1;

        // Act - Assert
        assertThrows(IllegalArgumentException.class,
                () -> new Employee(firstName, lastName, description, jobTitle, invalidJobYears));
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

    @Test
    void setGetJobTitle() {
        // Arrange
        String newJobTitle = "Gardener";

        // Act
        employee.setJobTitle(newJobTitle);
        String result = employee.getJobTitle();

        // Assert
        assertEquals(newJobTitle, result);
    }

    @Test
    void setGetJobYears() {
        // Arrange
        Integer newJobYears = 5;

        // Act
        employee.setJobYears(newJobYears);
        Integer result = employee.getJobYears();

        // Assert
        assertEquals(newJobYears, result);
    }

    @Test
    void testToString() {
        // Arrange
        String expected = "Employee{id=1, firstName='Frodo', lastName='Baggins', " +
                "description='An hobbit', jobTitle='Ring bearer', jobYears='3'}";

        // Act
        String result = employee.toString();

        // Assert
        assertEquals(expected, result);
    }
}