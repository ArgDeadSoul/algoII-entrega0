package models;

public class Destination {
    public String country;
    public String city;
    public double base_cost;
    public double cost;

    public Destination() {
        double midCost = base_cost;

        if(!isLocal()) {
            midCost = midCost*1.2;
        }
        if(User.getCountry_of_residence() == country) {
            double disc;
            disc = User.getAntiquity() * (base_cost*0.01);
            midCost = midCost * disc;
        }
        this.cost = midCost;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getBase_cost() {
        return base_cost;
    }

    public void setBase_cost(int base_cost) {
        this.base_cost = base_cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isLocal() {
        return country == "Argentina" | country == "ARG" | country == "argentina";
    }
}
