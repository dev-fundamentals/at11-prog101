package udacityTraining;

public class Storehouse {
	// Fields:
	private Device [] devices;
	private int devicesCount;
	
	// Constructor:
	public Storehouse() {
		this.devices = new Device [1000];
		this.devicesCount = 0;
	}
	
	// Methods:
	void addDevice(Device device) {
		devices [devicesCount] = device;
		devicesCount++;
	}
	
	Device searchDevice(String searchDeviceName) {
		for (int i = 0; i < devices.length; i++) {
			if(devices[i].name.equals(searchDeviceName)) {
				return devices[i];
			}
		}
		return null;
	}

}
