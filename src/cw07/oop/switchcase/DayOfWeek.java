package cw07.oop.switchcase;

public class DayOfWeek {
	public static final int SUNDAY = 1;
	public static final int MONDAY = 2;
	public static final int TUESDAY = 3;
	public static final int WEDNESDAY = 4;
	public static final int THURSDAY = 5;
	public static final int FRIDAY = 6;
	public static final int SATURDAY = 7;
	
	

	private int day;
	
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public DayOfWeek( int d) {
		// TODO Auto-generated constructor stub
		this.day = d;
	}

	@Override
	public String toString() {
		return "DayOfWeek [day=" + day + "]";
	}
	
	

}
