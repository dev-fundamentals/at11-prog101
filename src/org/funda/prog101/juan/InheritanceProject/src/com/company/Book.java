package com.company;

public class Book implements Comparable<Book> {
    int numberOfPages;
    String title;
    String author;

    //Constructor
    Book()
    {}
    Book(int numberOfPages, String title, String author)
    {
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.author = author;
    }

    //Methods
    public int compareTo(Book specificBook)
    {
        if (this.numberOfPages != specificBook.numberOfPages)
        {
            return this.numberOfPages - specificBook.numberOfPages;
        }

        if (!this.title.equals(specificBook.title))
        {
            return this.title.compareTo(specificBook.title);
        }
        return this.author.compareTo(specificBook.author);
    }
}
