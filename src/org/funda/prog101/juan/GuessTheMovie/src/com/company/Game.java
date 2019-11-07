package com.company;

import java.util.Scanner;

public class Game {
    public void movieGame(String movieChosen)
    {
        StringBuilder movieTitle = new StringBuilder();
        String inputLetter, wrongLetter = "";
        String movieTitleUpdated = "";
        int counter = 0;

        for (int item = 0; item < movieChosen.length(); item++) {
            movieTitle.append("_");
            System.out.println(movieTitle.toString());
        }
        Scanner scannerLetter = new Scanner(System.in);

        while (counter < 10) {
            System.out.println("You have guessed (" + counter + ") wrong letters: " + wrongLetter);
            System.out.print("Guess a letter: ");
            inputLetter = scannerLetter.nextLine();
            movieTitleUpdated = movieTitle.toString();
            for (int item = 0; item < movieChosen.length(); item++) {
                if (movieChosen.charAt(item) == inputLetter.charAt(0))
                {
                    movieTitle.setCharAt(item, inputLetter.charAt(0));
                }
            }
            if (movieTitle.toString().equals(movieTitleUpdated))
            {
                wrongLetter += inputLetter.charAt(0) + " ";
                counter++;
            }
            System.out.println(movieTitle);
            if (movieTitle.toString().equals(movieChosen))
            {
                System.out.println("You WIN...!");
                break;
            }
        }
        System.out.println("You loose, Try again");
        System.out.println("The movie was: " + movieChosen);
    }
}
