package test;

public abstract class Product {
	
	protected String id;
	protected String title;
	protected String category;
	protected double cost;
	protected ProductState state = new ProductState();
	
	public void print() {
		System.out.println("Title: " + title + " Category: " + category);
	}
	
	public boolean isSold() {
		return state.name.equals("sold");
	}
	
	public boolean isAllAviable() {
		return state.name.equals("aviable") && state.location.equals("store");
	}
}
