package com.company;

import java.io.File;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        File file = new File("60593-0.txt");
        Scanner scanner = new Scanner(file);
        int words = 0;
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }
        System.out.println(words);
    }
}















/*
* File file = new File("60593-0.txt");
        Scanner scanner = new Scanner(file);
        int words = 0;
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }
        System.out.println("Number of words: " + words);
* */