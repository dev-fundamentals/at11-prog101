package GuessMovie;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Movie {
	
	File movies;
	Path path;
	
	public Movie() {
		path = Paths.get("C:/Users/win/workspace/exercises/src/GuessMovie/MovieList.txt");
		//path = Paths.get("%users%/MovieList.txt");
	}

	public String selectMovie(int numberLine)   {
		try (Stream<String> lines = Files.lines(path);) {
			
		    String result = lines.skip(numberLine - 1).findFirst().get();
		    return result;
		}
		catch (Exception exception) {
			throw new IndexOutOfBoundsException("The list is only until 25"); 
					
		}
	}

}
