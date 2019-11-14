package SpaceChallengePackage;

public class U2 extends Rocket {
	private int cargoCarried;
	public U2(int totalWeight, int cargoCarried) {
		super(totalWeight);
		this.cargoCarried = cargoCarried;
				
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean launch() {
		//Chance of launch explosion = 5% * (cargo carried / cargo limit)
		double cargoLimit = totalWeight;
		//Random random =new Random();
		double chanceOfLaunchExplosion = 0.04 * (this.cargoCarried/cargoLimit);
		double random = Math.random();
		return  random> chanceOfLaunchExplosion;
	}

	@Override
	public boolean land() {
		//Chance of landing crash = 1% * (cargo carried / cargo limit)
		double cargoLimit = totalWeight;
		
		double chanceOfLaunchExplosion = 0.08 * (this.cargoCarried/cargoLimit);
		double random = Math.random();
		
		return  random > chanceOfLaunchExplosion;
	}

}
