package SpaceChallengePackage;

//import java.util.Random;

public class U1 extends Rocket {
	private int cargoCarried;
	
	public U1(int totalWeight, int cargoCarried) {
		super(totalWeight);
		this.cargoCarried = cargoCarried;
	}
	@Override
	public boolean launch() {
		//Chance of launch explosion = 5% * (cargo carried / cargo limit)
		double cargoLimit = totalWeight;
		//Random random =new Random();
		double chanceOfLaunchExplosion = 0.05 * (this.cargoCarried/cargoLimit);
		double random = Math.random();
		return  random > chanceOfLaunchExplosion;
	}

	@Override
	public boolean land() {
		//Chance of landing crash = 1% * (cargo carried / cargo limit)
		double cargoLimit = totalWeight;
		
		double chanceOfLaunchExplosion = 0.01 * (this.cargoCarried/cargoLimit);
		double random = Math.random();
		return  random > chanceOfLaunchExplosion;
	}
	

}
