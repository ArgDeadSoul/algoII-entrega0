package models;

import models.User;

public class Destination {
    var country = "ARG"
    var city = "BsAs";
    val base_cost = 100.00
    var cost = base_cost


    private fun setCost() {
        var midCost = this.cost;
        if(!isLocal()) {
            midCost = midCost*1.2;
        }
        if(User().getCountry_of_residence() == country) {
            var disc = 0.00
            disc = User().getAntiquity() * (base_cost*0.01);
            midCost = midCost * disc
        }
        this.cost = midCost;
    }

    private fun isLocal(): Boolean {
        return  country == "ARG"
    }
}
