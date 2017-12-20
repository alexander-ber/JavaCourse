package hw.oop.exam1;

public class Owner {
	private String name;
	private String phone;
	
	public Owner(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", phone=" + phone + "]";
	}

}
