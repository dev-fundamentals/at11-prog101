package com.company;
import java.awt.desktop.SystemSleepEvent;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean hasWon = false;
        int randomNumber = (int)(Math.random() * 100) + 1;
        System.out.println("I generate random number between 1 and 100");
        System.out.print("try to guess it ");
        Scanner scanner = new Scanner(System.in);

        for (int item = 10; item > 0; item--) {
            System.out.println("you have " + item + " guess left. Choose again");
            int guess = scanner.nextInt();
            System.out.println("your guess was " + guess);
            if (randomNumber < guess) {
                System.out.println("it's smaller than " + guess + " guess");
            }
            if (randomNumber > guess) {
                System.out.println("it's greater than " + guess + " guess");
            }
            if (guess == randomNumber)
            {
                hasWon = true;
                break;
            }
        }
        if (hasWon) {
            System.out.println("you Win...!");
        }
        else {
            System.out.println("You loose");
            System.out.println("The random number was " + randomNumber);
        }
    }
}


















/*
* int randomNumber = (int) (Math.random() * 100) +1;
        boolean hasWon = false;
        System.out.println("I have randomly choosen a number between  1 and 100");
        System.out.print("Try tto gess it");
        Scanner scanner = new Scanner(System.in);
        for (int item = 10; item > 0; item--) {
            System.out.println("you have " + item + " guess(s) left, Choose again: ");
            int guess = scanner.nextInt();
            System.out.println("Your guess was " + guess);
            if (randomNumber < guess)
            {
                System.out.println("It's smaller than " + guess + " guess");
            }
            if (randomNumber > guess)
            {
                System.out.println("It's greater than " + guess + " guess");
            }
            if (randomNumber == guess)
            {
                hasWon = true;
                break;
            }
        }
        if (hasWon)
        {
            System.out.println("You Win...");
        }
        else
        {
            System.out.println("You loose");
            System.out.println("The random number was " + randomNumber);
        }
 */