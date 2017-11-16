package cw07.oop.switchcase;

import java.util.Scanner;

public class DayApp {
	public static void main(String[] args) {
		 DayOfWeek d;
		 Scanner s = new Scanner(System.in);
		 int dayOw = 0;
		 do {
			 System.out.print("Enter day of week:");
			 dayOw = s.nextInt();
			 d = new DayOfWeek(dayOw);
		 
			 switch(d.getDay()) {
				case DayOfWeek.MONDAY: 
				case DayOfWeek.THURSDAY: System.out.println("JAVA COURSE!");break;
				case DayOfWeek.SUNDAY:
				case DayOfWeek.TUESDAY:
				case DayOfWeek.WEDNESDAY:
				case DayOfWeek.FRIDAY:
				case DayOfWeek.SATURDAY: System.out.println("NO JAVA COURSE!");break;
				default: System.out.println("NO JAVA COURSE!");
			 }
		 } while(dayOw != 99);
	 }
	
}
