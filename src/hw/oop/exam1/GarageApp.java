package hw.oop.exam1;

public class GarageApp {

	public static void main(String[] args) {
		Garage garage = new Garage();
		Owner o1 = new Owner("Bill","+123456789");
		Car c1 = new Car(o1, "CAR123-354-111", 123.45, "Red");
		Car c2 = new Car(o1, "CAR123-354-222", 1023.45, "Blue");
		Driver d1 = new Driver("Willy", "+1987645321", "L000001");
		Bus b1 = new Bus(o1, "BUS123-354-333", 1023.45, "Black", d1);
		Driver d2 = new Driver("John", "+100253586", "L000002");
		Track t1 = new Track(o1, "TRUCK123-354-444", 1023.45, "Black", d2, "Semi");
		
		System.out.println(o1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(b1);
		System.out.println(t1);
		
		//b. Tell the garage to receive the 2 cars
		garage.receiveCar(c1);
		garage.receiveCar(c2);
		
		//c. Print the ones who are waiting for a fix 
		garage.getGarageQueue("waiting");
		
		//d. Tell the garage to receive the bus 
		garage.receiveCar(b1);
		
		//e. Print the ones who are waiting for a fix
		garage.getGarageQueue("waiting");
		
		//f. Tell the garage to receive the truck
		garage.receiveCar(t1);
		
		//g. Print the ones who are waiting for a fix 
		garage.getGarageQueue("waiting");
		
		//h. Fix the cars
		System.out.println("---------------");
		garage.fixCar();
		
		//i. Print the ones who are waiting for a fix
		System.out.println("---------------");
		garage.getGarageQueue("waiting");
		
		//j. Fix the trucks
		System.out.println("---------------");
		garage.fixTruck();
		
		//k. Print the ones who are waiting for a fix 
		System.out.println("---------------");
		garage.getGarageQueue("waiting");
		
		//l. Print the fixed ones
		System.out.println("---------------");
		garage.getGarageQueue("fixed");
		
		//m. Create another car
		Car c3 = new Car(o1, "CAR123-354-555", 10000.00, "Yellow");
		garage.receiveCar(c3);

		//n. Print the ones who are waiting for a fix
		System.out.println("---------------");
		garage.getGarageQueue("waiting");
		
	}

}
