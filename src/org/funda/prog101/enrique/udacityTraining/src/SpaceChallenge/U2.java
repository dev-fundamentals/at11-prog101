package SpaceChallenge;

public class U2 extends Rocket{
	
	
	public U2() {
		this.cost = 120;
		this.maxWeight = 29000;
		// TODO Auto-generated constructor stub
	}

	public boolean launch() {
		return 0.04 * (this.weight / this.maxWeight) <= 0.04;
	}
	
	public boolean land() {
		return 0.08 * (this.weight / this.maxWeight) <= 0.08;
	}

}
