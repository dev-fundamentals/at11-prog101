package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Simulation simulation = new Simulation();
        File filePhase1 = new File("phase-1.txt");
        ArrayList<Item> itemArrayList = simulation.LoadItems(filePhase1);
        ArrayList<U1> itemU1ArrayList = simulation.loadU1(itemArrayList);
        int rocketU1 = simulation.runSimulation(itemU1ArrayList);
        System.out.println("Phase #1");
        System.out.println("Total U1 Rockets required " + rocketU1);
        System.out.println("Total budget required U1s " + rocketU1 * 100000000);

        ArrayList<U2> itemU2ArrayList = simulation.loadU2(itemArrayList);
        int rocketU2 = simulation.runSimulation(itemU2ArrayList);
        System.out.println("Total U2 Rockets required " + rocketU2);
        System.out.println("Total budget required U2s " + rocketU2 * 120000000);

        File filePhase2 = new File("phase-2.txt");
        ArrayList<Item> itemArrayList2 = simulation.LoadItems(filePhase2);
        ArrayList<U1> itemU1ArrayList2 = simulation.loadU1(itemArrayList2);
        int rocketU1_2 = simulation.runSimulation(itemU1ArrayList2);
        System.out.println("Phase #2");
        System.out.println("Total U1_2 Rockets required " + rocketU1_2);
        System.out.println("Total budget required U1_2s " + rocketU1_2 * 100000000);

        ArrayList<U2> itemU2ArrayList2 = simulation.loadU2(itemArrayList2);
        int rocketU2_2 = simulation.runSimulation(itemU2ArrayList2);
        System.out.println("Total U2_2 Rockets required " + rocketU2_2);
        System.out.println("Total budget required U2_2s " + rocketU2_2 * 120000000);
    }
}
