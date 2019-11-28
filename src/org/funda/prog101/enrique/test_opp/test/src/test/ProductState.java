package test;

public class ProductState {
	
	String location;
	String name;
	
	public ProductState() {
		this.location = "store";
		this.name = "aviable";
	}
	
	public void sold() {
		this.location = "customer";
		this.name = "sold";
	}
	
	public void damaged() {
		this.name = "damaged";
	}
	
	public void rent() {
		this.name = "rent";
		this.location = "customer";
	}

}
