package udacityTraining;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Storehouse storehouse = new Storehouse();
		Device calculator = new Device("Casio", 55);
		storehouse.addDevice(calculator);
		
		Device watch = new Device("Mi Band 3", 210);
		storehouse.addDevice(watch);
		
		Device headset = new Device("Hyrid Pro", 220);
		storehouse.addDevice(headset);
		
		Device caseSanmsung = new Device("Case Samsumg S20", 32);
		storehouse.addDevice(caseSanmsung);
		
		storehouse.searchDevice("Mi Band 3").printDevice();
	}
}
