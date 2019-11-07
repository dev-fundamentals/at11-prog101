package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Simulation {
    public Simulation()
    {}

    public ArrayList<Item> LoadItems (File file) throws FileNotFoundException {
        ArrayList<Item> line = new ArrayList<Item>();
        Scanner fileScanner = new Scanner(file);

        String lineString = "";
        while (fileScanner.hasNextLine())
        {
            Item item = new Item();
            lineString = fileScanner.nextLine();
            String [] lineItem = lineString.split("=");
            item.setName(lineItem[0]);
            item.setWight(Integer.parseInt(lineItem[1]));
            line.add(item);
        }
        return line;
    }

    public ArrayList<U1> loadU1(ArrayList<Item> itemArrayList)
    {
        ArrayList<U1> u1ArrayList = new ArrayList<U1>();
        U1 u1 = null;
        for (int item = 0; item < itemArrayList.size(); item++) {
            if (u1 == null)
                u1 = new U1();
            if (u1.canCarry(itemArrayList.get(item)))
            {
                u1.carry(itemArrayList.get(item));
            }
            else
            {
                u1ArrayList.add(u1);
                u1 = null;
            }
        }
        return u1ArrayList;
    }

    public ArrayList<U2> loadU2(ArrayList<Item> itemArrayList)
    {
        ArrayList<U2> u2ArrayList = new ArrayList<U2>();
        U2 u2 = null;
        for (int item = 0; item < itemArrayList.size(); item++) {
            if (u2 == null)
                u2 = new U2();
            if (u2.canCarry(itemArrayList.get(item)))
            {
                u2.carry(itemArrayList.get(item));
            }
            else
            {
                u2ArrayList.add(u2);
                u2 = null;
            }
        }
        return u2ArrayList;
    }

    public int runSimulation(Object rocketArrayList)
    {
        int numberOfRocket = 0;
        ArrayList<Rocket> arrayList = (ArrayList<Rocket>)rocketArrayList;
        for (Rocket rocketItem: arrayList) {
            if (rocketItem.launch() && rocketItem.land())
            {
                numberOfRocket++;
            }
        }
        return numberOfRocket;
    }
}
