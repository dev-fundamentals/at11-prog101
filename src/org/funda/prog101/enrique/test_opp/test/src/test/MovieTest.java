package test;


import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MovieTest {

	@Test
	void printTitle_printTitle_Batman() {
		ArrayList<String> actors = new ArrayList<String>();
		actors.add("Adam West");
		actors.add("Sara Stone");
		
		Movie movie = new Movie("Batman", "action", 9.99, actors);
		
		
		String expectedResukt  = "The movie is: Batman";
		String actualResult  = movie.printTitle();
	}
}
