package com.company;

public class Room {
    private double width;
    private double heigth;
    Room()
    {}

    public Room(double width, double heigth)
    {
        this.width = width;
        this.heigth = heigth;
    }

    public final double getArea()
    {
        return width * heigth;
    }
}
