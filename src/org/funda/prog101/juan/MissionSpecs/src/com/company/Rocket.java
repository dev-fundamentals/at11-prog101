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
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    public void setChanceExplosion(double chanceExplosion) {
        this.chanceExplosion = chanceExplosion;
    }
    public void setChanceCrash(double chanceCrash) {
        this.chanceCrash = chanceCrash;
    }

    public Rocket()
    {
        items = new ArrayList<Item>();
    }
    public Boolean launch()
    {
        double result = (chanceExplosion * ((double)wight/(double)maxWeight));
        if (result <= chanceExplosion)
            return  true;
        return false;
    }
    public Boolean land()
    {
        double result = (chanceCrash * ((double)wight/(double)maxWeight));
        if (result <= chanceCrash)
            return  true;
        return false;
    }
    public Boolean canCarry(Item item)
    {
        double tonne = (double) item.getWight() / 1000;
        return ((double)wight + tonne) <= (double) maxWeight ? true : false;
    }
    public void carry(Item item)
    {
        items.add(item);
        double tonne = (double) item.getWight() / 1000;
        wight += (int) tonne;
    }
}
