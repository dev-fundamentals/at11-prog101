package examprog;

public class VideoGame extends Product {
	private String company;
	final static String type = "VideoGame";
	public VideoGame(int code, String name, String category, String company) {
		super(code, name, category, type);
		this.company = company;
		
	}
}
