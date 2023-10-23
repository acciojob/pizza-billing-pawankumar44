package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
        // your code goes here
    }

    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraToppings() {
    }
}
