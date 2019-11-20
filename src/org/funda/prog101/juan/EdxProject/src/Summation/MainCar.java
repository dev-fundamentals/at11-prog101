package Summation;

public class MainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setMake("audi");
		car.setModel("a4");
		car.setYear(2014);
		car.setMiles(0);
		car.setIsNew(true);
		car.setOwner("Juan");
		
		boolean isMyCarOld = car.isOld();
		car.sell("alicia");
		System.out.println("Car owned by " + car.getOwner());
		
	}

}
