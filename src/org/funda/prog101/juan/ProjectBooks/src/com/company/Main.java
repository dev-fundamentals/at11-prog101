package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        //This is for printing String
//        System.out.print("Enter your address");
//        String address = scanner.nextLine();
//        System.out.print("Your address " + address);

        //This is for printing Integer
        System.out.print("enter your grade");
        int number = scanner.nextInt();
        if (number > 90)
        {
            System.out.print("Wow, you did well");
        }
        else
        {
            System.out.print("not bad, but you can do it better the next time");
        }
    }
}
