package Summation;

import java.util.*;
public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number ");
		int number = scanner.nextInt();
		int potentialFactor = 2;
		while (number % potentialFactor != 0) {
			potentialFactor++;
		}
		
		if (potentialFactor == number) {
			System.out.println("the number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}

}
