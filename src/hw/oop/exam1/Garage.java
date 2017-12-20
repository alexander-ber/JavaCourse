/*
1. Create a Garage project
2. Garage handles Cars, Buses and Trucks
3. A car has license plate number, speedometer, color and owner details (name, phone)
4. A bus has license plate number, speedometer, color, owner details (name, phone) and driver details (name, phone and license number)
5. A truck has license plate number, speedometer, color, owner details (name, phone), driver details (name, phone and license number) and type of carriage
6. When the garage fixes car, bus or truck, it marks it as fixed
Test it: 
a. Create 2 cars, 1 bus and 1 truck. 
b. Tell the garage to receive the 2 cars 
c. Print the ones who are waiting for a fix 
d. Tell the garage to receive the bus 
e. Print the ones who are waiting for a fix 
f. Tell the garage to receive the truck 
g. Print the ones who are waiting for a fix 
h. Fix the cars 
i. Print the ones who are waiting for a fix 
j. Fix the trucks 
k. Print the ones who are waiting for a fix 
l. Print the fixed ones 
m. Create another car 
n. Print the ones who are waiting for a fix

*/

package hw.oop.exam1;

public class Garage {
	private static final int QUEUE_SIZE = 10;
	private static int currentQueue = 0;
	private GarageQueue garageQueue[] = new GarageQueue[QUEUE_SIZE];
	
	public Garage() {
	}

	public void getGarageQueue(String status) {
		boolean filter = false;
		if(status == "fixed") {
			filter = true;
		} 
		for (int i = 0; i < currentQueue; i++) {
			if(garageQueue[i].isFixed() == filter) {
				System.out.println(garageQueue[i].toString());
			}
		}
	}

	public void receiveCar(Car car) {
		GarageQueue gq = new GarageQueue(car, false);
		this.garageQueue[currentQueue] = gq;
		System.out.println("Car " +"#"+ gq.getItem().getLicensePlateNumber()+" recived on place " +currentQueue);
		currentQueue++;
	}
	
	public void fixCar() {
		for (int i = 0; i < currentQueue; i++) {
			Car item = garageQueue[i].getItem();
			if(!garageQueue[i].isFixed() && ((item instanceof Car) && !(item instanceof Bus) && !(item instanceof Track)) ) {
				garageQueue[i].setFixed(true);
				System.out.println(garageQueue[i]);
			}
		}
	}

	public void fixBus() {
		for (int i = 0; i < currentQueue; i++) {
			Car item = garageQueue[i].getItem();
			if(!garageQueue[i].isFixed() && ((item instanceof Bus) && !(item instanceof Track)) ) {
				garageQueue[i].setFixed(true);
				System.out.println(garageQueue[i]);
			}
		}
	}

	public void fixTruck() {
		for (int i = 0; i < currentQueue; i++) {
			Car item = garageQueue[i].getItem();
			if(!garageQueue[i].isFixed() && item instanceof Track ) {
				garageQueue[i].setFixed(true);
				System.out.println(garageQueue[i]);
			}
		}
	}

	
	

}
