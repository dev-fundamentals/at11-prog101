package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue orders = new LinkedList();
        orders.add("order1");
        orders.add("order2");
        orders.add("order3");
        System.out.println(orders.poll());
        System.out.println(orders.poll());
        System.out.println(orders.poll());
    }
}
