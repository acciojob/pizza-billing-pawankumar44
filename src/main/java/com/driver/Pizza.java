package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    //cheese to be added first
    private boolean cheeseAdded = false;
    private int totalCheese = 0;

    //topping to be added later
    private boolean toppingAdded = false;
    private int totalToppings = 0;

    private boolean bagAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg) price = 300;
        else price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.cheeseAdded = true;
        this.totalCheese+=80;
//        this.price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        this.toppingAdded = true;
//        this.price+= this.isVeg ? 70 : 120;
        this.totalToppings+= this.isVeg ? 70 : 120;
    }

    public void addTakeaway(){
        // your code goes here
        this.bagAdded = true;
//        price+=20;
    }

    public String getBill(){
        // your code goes here
        bill = "";
        bill+= "\nBase Price Of The Pizza: "+this.price+"\n";
        if(this.cheeseAdded) bill+= "Extra Cheese Added: "+this.totalCheese+"\n";
        if(this.toppingAdded) bill+= "Extra Toppings Added: "+this.totalToppings+"\n";
        if(this.bagAdded) bill+= "Paperbag Added: 20\n";
        bill+="Total Price: "+
                (this.price+this.totalCheese+this.totalToppings+
                        (this.bagAdded ? 20 : 0))+"\n";
        return this.bill;
    }
}
