package models;

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

import models.User;
import java.time.LocalDate;

class UserSpec : DescribeSpec({
        isolationMode = IsolationMode.InstancePerTest

        describe("dado un usuario"){
            val user = User();
            it("su año de entrada va a ser uno"){
                user.getAntiquity() shouldBe 1
            }
        }
})