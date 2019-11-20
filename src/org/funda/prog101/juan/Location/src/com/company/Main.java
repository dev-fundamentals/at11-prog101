package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        if (args.length == 0)
        {
            System.out.println("enter your location please");
        }
        else
        {
            String location = args[0];
            int temperature = 60 + (int)(Math.random() * 100);
            System.out.println("the wather in" + location + "is " + temperature);
        }
    }
}
