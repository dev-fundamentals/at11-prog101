package com.company;

public class Item {
    private String name;
    private int wight;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setWight(int wight)
    {
        this.wight = wight;
    }

    public int getWight()
    {
        return wight;
    }

    public Item()
    {}

    public Item(String name, int wight)
    {
        this.name = name;
        this.wight = wight;
    }
}
