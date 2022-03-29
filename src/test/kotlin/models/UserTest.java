package models;

import java.time.LocalDate;
import models.User;

import io.kotest.assertions.throwables.shouldThrow;
import io.kotest.core.spec.IsolationMode;
import io.kotest.core.spec.style.DescribeSpec;
import io.kotest.matchers.shouldBe;


class UserTest : DescribeSpec({
        isolationMode = IsolationMode.InstancePerTest

        describe("dado un auto"){
            val user = User("Jhon","Smith","username123","ARG",LocalDate.now().minusYears(1).toString());
            it("su año de entrada va a ser uno"){
                user.getAntiquity() shouldBe 1
            }
        }
})