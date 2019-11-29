package examoop;

import java.util.ArrayList;

public class Movie extends Product{
	private ArrayList<Actor> actors;
	private int year;
	private MovieState movieState;
	
	public int getYear() {
		return year;
	}
	public MovieState getMovieState() {
		return movieState;
	}
	public ArrayList<Actor> getActors(){
		return actors;
	}
	
	public Movie(int id, String title, ProdutCategory category, ProductStatus status, double price,
				int year, MovieState movieState)
	{
		super(id, title, category, status, price);
		this.year = year;
		this.movieState = movieState;
		actors = new ArrayList<Actor>();
	}
	
	public void addActor(Actor actor) {
		actors.add(actor);
	}

}
