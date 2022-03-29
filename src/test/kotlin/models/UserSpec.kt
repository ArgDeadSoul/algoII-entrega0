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
            it("su antiguedad"){
                user.antiquity shouldBe 1
            }
            it("su nombre debe ser jhon"){
                user.name shouldBe "Jhon"
            }
        }
})