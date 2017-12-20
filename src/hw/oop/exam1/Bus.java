package hw.oop.exam1;

public class Bus extends Car{
	private Driver driver;

	public Bus(Owner owner, String licensePlateNumber, double speedometer, String color, Driver driver) {
		super(owner, licensePlateNumber, speedometer, color);
		this.driver = driver;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Bus [driver=" + driver.toString() + super.toString() + "]";
	}
	
	
}
