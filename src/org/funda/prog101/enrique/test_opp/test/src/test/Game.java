package test;

public class Game extends Product{
	private String requisites;
	
	public Game(String title, String category, Double cost, String requisites) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.requisites = requisites;
	}
	
	public void printRequisites() {
		System.out.println("The requisites are: "+requisites);
	}

}
