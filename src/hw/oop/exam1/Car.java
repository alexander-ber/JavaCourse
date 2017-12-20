package hw.oop.exam1;

public class Car {
	private Owner owner; 
	private String licensePlateNumber;
	private double speedometer;
	private String color;
	
	public Car(Owner owner, String licensePlateNumber, double speedometer, String color) {
		this.owner = owner;
		this.licensePlateNumber = licensePlateNumber;
		this.speedometer = speedometer;
		this.color = color;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public double getSpeedometer() {
		return speedometer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [owner=" + owner.toString() + ", licensePlateNumber=" + licensePlateNumber + ", speedometer=" + speedometer
				+ ", color=" + color + "]";
	}
	
	
}
