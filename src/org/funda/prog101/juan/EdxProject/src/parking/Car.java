package parking;

public class Car {
	private String ownerName;
	private int ownerLicenceNum;
	private int registrationNum;
	private int parkingLoc;
	
	public Car(String ownerName, int ownerLicenceNum, int registrationNum) {
		this.ownerName = ownerName;
		this.ownerLicenceNum = ownerLicenceNum;
		this.registrationNum = registrationNum;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getOwnerLicenceNum() {
		return ownerLicenceNum;
	}
	public void setOwnerLicenceNum(int ownerLicenceNum) {
		this.ownerLicenceNum = ownerLicenceNum;
	}
	public int getRegistrationNum() {
		return registrationNum;
	}
	public int getParkingLoc() {
		return parkingLoc;
	}
	public void setParkingLoc(int parkingLoc) {
		this.parkingLoc = parkingLoc;
	}
}
