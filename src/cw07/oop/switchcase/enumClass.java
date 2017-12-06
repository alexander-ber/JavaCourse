package cw07.oop.switchcase;

public enum enumClass {
	SUNDAY(1),
	MONDAY(2),
	TUESDAY(3),
	WEDNESDAY(4),
	THURSDAY(5),
	FRIDAY(6),
	SATURDAY(7),
	
	ONE(1),
	TWO(2);
	
	int order;
	private enumClass(int order) {
		this.order = order;
	}
	public int getOrder() {
		return order;
	}
	
	public void setOrder(int order) {
		this.order = order;
	}
	
	
}