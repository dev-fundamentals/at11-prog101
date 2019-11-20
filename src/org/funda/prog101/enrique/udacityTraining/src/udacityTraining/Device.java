package udacityTraining;


public class Device {
	String name;
	private int price;
	
	public Device(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void printDevice() {
		System.out.println("Device: "+name + "\nPrecio: "+price);
	}
}
