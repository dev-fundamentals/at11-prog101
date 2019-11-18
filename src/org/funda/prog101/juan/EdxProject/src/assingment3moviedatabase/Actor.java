package assingment3moviedatabase;

import java.util.ArrayList;

public class Actor {
	private String name;
	private ArrayList<Movie> movies;
	
	
	public Actor()
	{}
	
	public Actor(String name)
	{
		this.name = name;
		movies = new ArrayList<Movie>();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMovie(Movie movie) {
		movies.add(movie);
	}
	public ArrayList<Movie> getMovies(){
		return movies;
	}
	public double getAverageOfMovies()
	{
		double sum = 0;
		for (Movie movie : movies) {
			sum += movie.getRating();
		}
		return sum;
	}
}
