package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    //cheese to be added first
    private boolean cheeseAdded;
    private int totalCheese ;

    //topping to be added later
    private boolean toppingAdded;
    private int totalToppings;

    private boolean bagAdded = false;

    private int totalprice ;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            price = 300;
            totalprice = 300;
        }
        else{
            price = 400;
            totalprice = 400;
        }

        cheeseAdded = false;
        totalCheese = 0;

        //topping to be added later
        toppingAdded = false;
        totalToppings = 0;

        bagAdded = false;

    }

    public int getPrice(){
        return this.totalprice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded){
            this.cheeseAdded = true;
            this.totalCheese+=80;
            this.totalprice+=80;
        }

//        this.price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.toppingAdded){
            this.toppingAdded = true;
//        this.price+= this.isVeg ? 70 : 120;
            this.totalToppings+= this.isVeg ? 70 : 120;
            this.totalprice+= this.isVeg ? 70 : 120;
        }

    }

    public void addTakeaway(){
        // your code goes here
        this.bagAdded = true;
        this.totalprice+=20;
//        price+=20;
    }

    public String getBill(){
        // your code goes here
        bill = "";
        bill+= "Base Price Of The Pizza: "+this.price+"\n";
        if(this.cheeseAdded) bill+= "Extra Cheese Added: "+this.totalCheese+"\n";
        if(this.toppingAdded) bill+= "Extra Toppings Added: "+this.totalToppings+"\n";
        if(this.bagAdded) bill+= "Paperbag Added: 20\n";
        bill+="Total Price: "+this.totalprice+"\n";
//        bill+="Total Price: "+
//                (this.price+this.totalCheese+this.totalToppings+
//                        (this.bagAdded ? 20 : 0))+"\n";
        return this.bill;
    }
}
