package examoop;

public abstract class Product {
	protected int id;
	protected String title;
	protected ProdutCategory category;
	protected ProductStatus status;
	protected double price;
	
	public Product(int id, String title, ProdutCategory category, ProductStatus status, double price)
	{
		this.id = id;
		this.title = title;
		this.category = category;
		this.status = status;
		this.price = price;
	}	
}
