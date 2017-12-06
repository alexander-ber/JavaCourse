package cw07.oop.switchcase;

import java.util.Scanner;

public class DayApp {
	public static void main(String[] args) {
		
		DayOfWeek d;
		Scanner s = new Scanner(System.in);
		 
		 int dayOw = 0;
		 do {
			 
			 System.out.print("Enter day of week [1-7] (99 for exit):");
			 dayOw = s.nextInt();
			 d = new DayOfWeek(dayOw);
		 
			 switch(d.getDay()) {
				case DayOfWeek.MONDAY: 
				case DayOfWeek.THURSDAY: 
					System.out.println("JAVA COURSE!");break;
				case DayOfWeek.SUNDAY:
				case DayOfWeek.TUESDAY:
				case DayOfWeek.WEDNESDAY:
				case DayOfWeek.FRIDAY:
				case DayOfWeek.SATURDAY: 
					System.out.println("NO JAVA COURSE!");break;
				default: System.out.println("NO JAVA COURSE!");
			 }
			 
		 } while(dayOw != 99);
		 
		 
		 //==========================
		 //  USING ENUM
		 // enum - class with private constructor, DP: singleton
		 //==========================
		 enumClass day = enumClass.MONDAY;
		
		 switch(day) {
			case MONDAY: 
			case THURSDAY: 
				System.out.println("USING ENUM > JAVA COURSE!");break;
			case SUNDAY:
			case TUESDAY:
			case WEDNESDAY:
			case FRIDAY:
			case SATURDAY: 
				System.out.println("USING ENUM > NO JAVA COURSE!");break;
			default: System.out.println("USING ENUM > NO JAVA COURSE!");
		 }
		 
		 //==========================
		 //  USING ENUM 2 
		 // enum - static Method
		 //==========================
		  
		 Suit ss = Suit.getByRepresentation("C");
		 System.out.println("USING ENUM 2 >" + ss);
		
	 }
	
}
