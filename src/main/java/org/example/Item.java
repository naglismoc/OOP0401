package org.example;

public class Item {
   // properties
    public String title;
    public String description;
    public double price;


    public Item(){

    }
    public Item(String title, String description){
        this.title = title;
        this.description = description;
    }
    public Item(String title, String description, double price){
        this.title = title;
        this.description = description;
        this.price = price;
    }


    @Override
    public String toString(){
        return "Title:" + this.title + ", Description:" + this.description + ", Price:" + this.price + "e";
    }

    public static void classDescription(){
        System.out.println("Si klase yra skirta kurti prekems.");
    }
}
