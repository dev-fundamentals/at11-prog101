package SpaceChallengePackage;

import java.util.ArrayList;

public class Rocket implements SpaceShip {
	private int weighting;
	protected int totalWeight;
	private int weightCarry;
	protected ArrayList<Item> RoketItems;
	
	
	
	public Rocket (int totalWeight) {
		this.totalWeight = totalWeight;
		RoketItems = new ArrayList<>();
	}
	
	public boolean canCarry(Item item) {
		this.weighting += item.weight;
		return this.weighting < totalWeight ;
	}
	public void carry(Item item) {
		this.weightCarry += item.weight;
		
	}
	public boolean land() {
		return true;
	}
	
	public boolean launch() {
		return true;
	}

}
