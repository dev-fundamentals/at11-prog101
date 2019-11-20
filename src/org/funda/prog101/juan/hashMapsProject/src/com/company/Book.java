package com.company;

public class Book {
    String title;
    String author;
    int numOfPages;
    int publishedYear;
    int edition;
    String ISBN;

    public Book()
    {}

    public Book(String title, String author, int numOfPages, int publishedYear, int edition, String ISBN)
    {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
        this.publishedYear = publishedYear;
        this.edition = edition;
        this.ISBN = ISBN;
    }

    public void AddBook(String title, String author, int numOfPages, int publishedYear, int edition, String ISBN)
    {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
        this.publishedYear = publishedYear;
        this.edition = edition;
        this.ISBN = ISBN;
    }
}
