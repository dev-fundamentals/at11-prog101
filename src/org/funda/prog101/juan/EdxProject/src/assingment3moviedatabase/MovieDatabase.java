package assingment3moviedatabase;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieDatabase {
	private ArrayList<Movie> movieList;
	private ArrayList<Actor> actorList;
	
	public MovieDatabase()
	{
		movieList = new ArrayList<Movie>();
		actorList = new ArrayList<Actor>();
	}
	
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}
	public ArrayList<Actor> getActorList(){
		return actorList;
	}
	
	public void addActor(String name, String movieName) {
		Actor actor = actorList.stream().
				filter(m -> m.getName().equals(name)).
				findAny().orElse(null);
		Movie movie = movieList.stream().
				filter(m -> m.getName().equals(movieName)).
				findAny().orElse(null);
		actor.setMovie(movie);
	}
	
	public void addMovie(String name, String[] actors) {
		Movie movie = movieList.stream().
				filter(m -> m.getName().equals(name)).
				findAny().orElse(null);
		if (movie == null) {
			movie = new Movie(name);
			movieList.add(movie);
		}
		
		for (String actorName : actors) {
			Actor actor = actorList.stream().
					filter(m -> m.getName().equals(actorName)).
					findAny().orElse(null);
			if (actor == null) {
				actor = new Actor(actorName);
				movie.setActor(actor);
				actorList.add(actor);
			}
			else {
				movie.setActor(actor);
			}
		}
	}
	
	public void addRating(String name, double rating)
	{
		Movie movie = movieList.stream().
				filter(m -> m.getName().equals(name)).
				findAny().orElse(null);
		if (movie != null) {
			if (movie.getRating() == 0.0)
				movie.setRating(rating);
		}
		else
			System.out.println("there are not " + name);
	}
	
	public void updateRating(String name, double newRating)
	{
		Movie movie = movieList.stream().
				filter(m -> m.getName().equals(name)).
				findAny().orElse(null);
		if (movie != null) {
			if (movie.getRating() == 0.0)
				movie.setRating(newRating);
		}
	}
	
	public String getBestActor()
	{
		double maxValue = 0;
		double newValue = 0;
		String actorName = "";
		for (Actor actor : actorList) {
			newValue = actor.getAverageOfMovies();
			if (newValue > maxValue) {
				maxValue = newValue;
				actorName = actor.getName() + "\nHer/His average: " + maxValue;
			}
		}
		return actorName;
	}
	
	public String getBestMovie()
	{
		double maxValue = 0;
		double newValue = 0;
		String movieName = "";
		for (Movie movie : movieList) {
			newValue = movie.getRating();
			if (newValue > maxValue) {
				maxValue = newValue;
				movieName = movie.getName() + "\nHer/His average: " + maxValue;
			}
		}
		return movieName;
	}
}
