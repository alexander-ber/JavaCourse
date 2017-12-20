package hw.oop.exam1;

public class GarageQueue {
	private Car item;
	private boolean isFixed = false;
	
	public Car getItem() {
		return item;
	}

	public void setItem(Car item) {
		this.item = item;
	}

	public boolean isFixed() {
		return isFixed;
	}

	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}

	public GarageQueue(Car item, boolean isFixed) {
		super();
		this.item = item;
		this.isFixed = isFixed;
	}

	@Override
	public String toString() {
		return "GarageQueue [item=" + item + ", isFixed=" + isFixed + "]";
	}
	
	


}
