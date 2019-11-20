package assingment3moviedatabase;

import java.util.ArrayList;

public class Movie {
	private String name;
	private ArrayList<Actor>actors;
	private double rating;
	
	public Movie(String name)
	{
		this.name = name;
		actors = new ArrayList<Actor>();
		this.rating = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setActor(Actor actor) {
		actors.add(actor);
	}
	public ArrayList<Actor> getActors(){
		return actors;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public double getRating() {
		return rating;
	}
}
