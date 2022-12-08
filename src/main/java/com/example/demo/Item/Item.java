package com.example.demo.Item;

public class Item {
    private String name;
    private int portion;
    private String portionName;
    private int calories;

    public Item(String name, int portion, String portionName, int calories) {
        this.name = name;
        this.portion = portion;
        this.portionName = portionName;
        this.calories = calories;
    }
    public String getName() {
        return this.name;
    }
    public int getPortion() {
        return this.getPortion();
    }
    public String getPortionName(){
        return this.portionName;
    }
    public int getCalories(){
        return this.calories;
    }
}
