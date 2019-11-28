package examprog;

public class Movie extends Product {
	private int year;
	final static String type = "Movie";
	public Movie(int code, String name, String category, int year) {
		super(code, name, category, type);
		this.year = year;
	}

}
