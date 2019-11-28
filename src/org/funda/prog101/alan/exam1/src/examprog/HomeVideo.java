package examprog;

public class HomeVideo extends Product {
	private String languague;
	final static String type = "HomeVideo";
	public HomeVideo(int code, String name, String category, String language) {
		super(code, name, category, type);
		// TODO Auto-generated constructor stub
		this.languague = language;
	}
	

}
