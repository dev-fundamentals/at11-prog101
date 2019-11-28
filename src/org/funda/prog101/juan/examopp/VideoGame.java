package examopp;

public class VideoGame extends Product{
	private String version;
	
	public String getVersion() {
		return version;
	}
	
	public VideoGame(int id, String title, ProdutCategory category,
			ProductStatus status, double price, String version) {
		super(id, title, category, status, price);
		this.version =version;
	}
}
