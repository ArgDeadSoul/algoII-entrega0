package models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import models.User;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User testUser = new User("Jhon", "Smith", "username123", "ARG", LocalDate.now().minusYears(1).toString());

    @Test
    void getName() {
    }

    @Test
    void getLastname() {
    }

    @Test
    void getUsername() {
    }

    @Test
    void getIn_date() {
    }

    @Test
    void getAntiquity() {
        int expected = 1;
        assertEquals(expected, testUser.getAntiquity());
    }

    @Test
    void getCountry_of_residence() {
    }
}