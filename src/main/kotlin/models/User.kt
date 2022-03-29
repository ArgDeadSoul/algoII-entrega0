package models;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime

class User(var name: String = "Jhon",
           var lastname: String = "Doe",
           var username: String = "JoDo4",
           var in_date: LocalDate = LocalDate.now().minusYears(1),
           var antiquity: Long = Duration.between(in_date.atStartOfDay(), LocalDate.now().atStartOfDay()).toDays() / 365,
           var country_of_residence: String = "ARG"
        ) {

}
