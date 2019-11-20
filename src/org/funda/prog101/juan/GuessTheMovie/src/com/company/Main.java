package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        List<String> line = new ArrayList<String>();
        while (scanner.hasNextLine())
        {
            line.add(scanner.nextLine());
        }
        int randomNumber = (int)(Math.random() * line.size() + 1);
        String movieChosen = line.get(randomNumber);
        Game game = new Game();
        game.movieGame(movieChosen);
    }
}
