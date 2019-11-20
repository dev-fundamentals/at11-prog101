package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book book = new Book(12, "la nina", "juan de la rosa");
        Book testBook = new Book();
        testBook.numberOfPages = 14;
        testBook.title = "la nina";
        testBook.author = "felix";
        int number = book.compareTo(testBook);
        System.out.println(number);
    }
}
