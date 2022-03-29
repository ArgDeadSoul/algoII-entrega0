package models;

import models.User;

public class Destination(var country: String = "ARG",
                         var city: String = "Bs As",
                         var base_cost: Double = 100.00,
                         var cost: Double = base_cost
                        ) {

    private fun setFinalCost(user: User) {
        var finalCost = this.cost;

        if(!isLocal()) {
            finalCost *= 1.2;
        }
        if(sameDestination(user)) {
            var disc = 0.00
            disc = user.antiquity * (base_cost*0.01);
            finalCost *= disc
        }
        this.cost = finalCost;
    }

    private fun isLocal(): Boolean {
        return  country.equals("ARG")
    }

    private fun sameDestination(user: User): Boolean {
        return user.country_of_residence == this.country
    }
}
