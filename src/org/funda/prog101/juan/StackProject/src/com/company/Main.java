package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack newFeed = new Stack();
        newFeed.add("Morning news");
        newFeed.add("Afternoon news");
        newFeed.add("Evening news");
        String breakingNews = (String) newFeed.pop();
        System.out.println(breakingNews);
        String moreNews = (String) newFeed.pop();
        System.out.println(moreNews);
        String peekNews = (String) newFeed.peek();
        System.out.println(peekNews);
    }
}
