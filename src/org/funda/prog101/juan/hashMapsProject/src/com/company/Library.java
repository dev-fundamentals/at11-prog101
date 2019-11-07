package com.company;

import java.util.HashMap;

public class Library {
    Book taleOfTwoCities = new Book("odisea", "homero", 10, 2012, 1, "1010");

    HashMap<String, Book> allBooks = new HashMap<String, Book>();

    Book findBookByISBN(String isbn)
    {
        Book book = allBooks.get(isbn);
        return book;
    }
}
