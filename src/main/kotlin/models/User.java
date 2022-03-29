package models;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;

public class User {
    public String name;
    public String lastname;
    public String username;
    public LocalDate in_date;
    public static double antiquity;
    public static String country_of_residence;

    public User(String name, String lastname, String username, String country_of_residence, String in_date) {
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        LocalDate new_date = LocalDate.parse(in_date);
        this.in_date = new_date;
        // This functions is to convert from duration to int, to operate
        this.antiquity = (int)Duration.between(LocalDate.now(), this.in_date).toDays() / 365;
        this.country_of_residence = country_of_residence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getIn_date() {
        return in_date;
    }

    public void setIn_date(LocalDate in_date) {
        this.in_date = in_date;
    }

    public static double getAntiquity() {
        return antiquity;
    }

    public void setAntiquity(double antiquity) {
        this.antiquity = antiquity;
    }

    public static String getCountry_of_residence() {
        return country_of_residence;
    }

    public void setCountry_of_residence(String country_of_residence) {
        this.country_of_residence = country_of_residence;
    }
}
