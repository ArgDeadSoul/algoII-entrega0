package models;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;

class User {
    val name = "Jhon"
    val lastname = "Doe"
    val username = "JoDo"
    val in_date = LocalDate.now().minusYears(1).toString()
    val antiquity = 1
    val country_of_residence = "ARG"

    // date format: yyyy-MM-dd
    //fun User(name, lastname, username, country_of_residence, in_date) {
    //    this.name = name;
    //    this.lastname = lastname;
    //    this.username = username;
    //    LocalDate new_date = LocalDate.parse(in_date);
    //    this.in_date = new_date;
    //    // This functions is to convert from duration to int, to operate
    //    this.antiquity = (int)Duration.between(LocalDate.now(), this.in_date).toDays() / 365;
    //    this.country_of_residence = country_of_residence;
    //}

    @JvmName("getAntiquity1")
    fun getAntiquity(): Int{
        return this.antiquity
    }

    @JvmName("getCountry_of_residence1")
    fun getCountry_of_residence(): String{
        return this.country_of_residence;
    }
}
