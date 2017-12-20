package hw.oop.exam1;

public class Driver extends Owner {
	private String licenseNumber;

	public Driver(String name, String phone, String licenseNumber) {
		super(name, phone);
		this.licenseNumber = licenseNumber;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	@Override
	public String toString() {
		return "Driver [licenseNumber=" + licenseNumber + ", Name " + super.getName() + ", Phone "+ super.getPhone() + "]";
	}

}
