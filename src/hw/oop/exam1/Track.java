package hw.oop.exam1;

public class Track extends Bus{

	private String carriage;

	public Track(Owner owner, String licensePlateNumber, double speedometer, String color, Driver driver,
			String carriage) {
		super(owner, licensePlateNumber, speedometer, color, driver);
		this.carriage = carriage;
	}

	public String getCarriage() {
		return carriage;
	}

	public void setCarriage(String carriage) {
		this.carriage = carriage;
	}

	@Override
	public String toString() {
		return "Track [carriage=" + carriage + "]" + super.toString();
	}
	
}
