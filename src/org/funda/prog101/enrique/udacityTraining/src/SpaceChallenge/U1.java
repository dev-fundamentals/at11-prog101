package SpaceChallenge;

public class U1 extends Rocket{

	public U1() {
		this.cost = 100;
		this.maxWeight = 18000;
		// TODO Auto-generated constructor stub
	}
	
	public boolean launch() {
		return 0.05 * (this.weight / this.maxWeight) <= 0.05;
	}
	
	public boolean land() {
		return 0.01 * (this.weight / this.maxWeight) <= 0.01;
	}

}
