package com.company;

import java.util.ArrayList;

public abstract class Rocket implements SpaceShip {
    private int wight;
    private int cost;
    private int maxWeight;
    private double chanceExplosion;
    private double chanceCrash;
    private ArrayList<Item> items;

    public void setWight(int wight) {
        this.wight = wight;
    }
    public int getWight() {
        return wight;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    public int getMaxWeight() {
        return maxWeight;
    }
    public void setChanceExplosion(double chanceExplosion) {
        this.chanceExplosion = chanceExplosion;
    }
    public double getChanceExplosion() {
        return chanceExplosion;
    }
    public void setChanceCrash(double chanceCrash) {
        this.chanceCrash = chanceCrash;
    }
    public double getChanceCrash() {
        return chanceCrash;
    }
    public void setItems(ArrayList<Item> item) {
        this.items = item;
    }
    public ArrayList<Item> getItems() {
        return items;
    }

    public Rocket()
    {
        items = new ArrayList<Item>();
    }
    public Boolean launch()//should always return true
    {
        double result = (chanceExplosion * ((double)wight/(double)maxWeight));
        if (result <= chanceExplosion)
            return  true;
        return false;
    }
    public Boolean land()//should always return true
    {
        double result = (chanceCrash * ((double)wight/(double)maxWeight));
        if (result <= chanceCrash)
            return  true;
        return false;
    }
    public Boolean canCarry(Item item)
    {//  takes an Item as an argument and returns if the rocket can carry
        double tonne = (double) item.getWight() / 1000;
        return ((double)wight + tonne) <= (double) maxWeight ? true : false;
    }
    public void carry(Item item)
    {//updates the current weight of the rocket.
        items.add(item);
        double tonne = (double) item.getWight() / 1000;
        wight += (int) tonne;
    }
}
