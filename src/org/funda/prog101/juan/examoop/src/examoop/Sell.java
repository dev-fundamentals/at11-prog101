package examoop;

import java.util.ArrayList;

public class Sell {
	private int storeId;
	private int customerId;
	private ArrayList<Movie> movies;
	private double totalPrice;
	
	public int getStoreId() {
		return storeId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public ArrayList<Movie> getMovies() {
		return movies;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public Sell(int storeId, int customerId) {
		this.storeId = storeId;
		this.customerId = customerId;
		movies = new ArrayList<Movie>();
		this.totalPrice = 0;
	}
	
	public void addMovie(Movie movie) {
		totalPrice += movie.price;
		movies.add(movie);
	}
}
