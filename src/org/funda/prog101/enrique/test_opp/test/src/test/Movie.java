package test;

import java.util.ArrayList;

public class Movie extends Product{
	private ArrayList<String> actors;
	
	public Movie(String title, String category, double cost, ArrayList<String> actors) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.actors = actors;
	}
	
	public String printTitle() {
		return "The movie is: " + title;
	}
}
