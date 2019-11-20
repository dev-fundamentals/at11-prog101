package SpaceChallenge;



public class Rocket implements SpaceShip{
	
	public int cost;
	public int weight;
	public int maxWeight;
	
	public Rocket() {
		this.weight = 0;
	}

	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		// TODO Auto-generated method stub
	
		return maxWeight >= item.weight + weight;
	}

	@Override
	public void carry(Item item) {
		// TODO Auto-generated method stub
		
		weight += item.weight;
	}
	
}
