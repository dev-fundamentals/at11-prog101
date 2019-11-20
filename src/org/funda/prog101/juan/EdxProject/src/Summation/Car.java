package Summation;

import java.time.Year;
import java.util.Calendar;

public class Car {
	private String make;
	private String model;
	private int year;
	private boolean isNew;
	private double miles;
	private String owner;
	
	public void setMake(String make) {
		this.make = make;
	}
	public String getMake() {
		return make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setIsNew(boolean isNew) {
		this.isNew = isNew;
	}
	public boolean getIsNew() {
		return isNew;
	}
	public void setMiles(double miles) {
		this.miles = miles;
	}
	public double getMiles() {
		return miles;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	
	public void sell(String newOwner)
	{
		owner = newOwner;
		if(isNew)
		{
			isNew = false;
		}
	}
	
	public boolean isOld()
	{
		int thisYear = Year.now().getValue();
		if (thisYear - year > 10) {
			return true;
		}
		else
		{
			return false;
		}
	}
}
