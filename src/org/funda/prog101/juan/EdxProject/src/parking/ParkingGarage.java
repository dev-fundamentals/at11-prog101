package parking;

public class ParkingGarage {
	private Car[] cars;
	private int spots;
	
	public ParkingGarage(int spots)
	{
		this.spots = spots;
		cars = new Car[spots];
	}
	
	public boolean park(Car carToBeParked)
	{
		int i = 0;
		while ((cars[i] != null) && (i < cars.length)) {
			i++;
		}
		if (1 == cars.length)
			return false;
		cars[i] = carToBeParked;
		carToBeParked.setParkingLoc(i);
		return true;
	}
	
	public static void main(String[] args) {
		ParkingGarage parkingGarage = new ParkingGarage(2);
		Car car1 = new Car("Francisco", 12, 1212);
		parkingGarage.park(car1);
		Car car2 = new Car("Angela", 13, 1313);
		parkingGarage.park(car2);
		
		for (int item = 0; item < parkingGarage.spots; item++) {
			System.out.println(parkingGarage.cars[item].getOwnerName());
			System.out.println(parkingGarage.cars[item].getOwnerLicenceNum());
		}
	}
}
