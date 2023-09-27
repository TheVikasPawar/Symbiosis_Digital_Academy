package Day3;


class Vehicle{
	void run() {
		System.out.println("Vehicle is Running....");
	}
}

//Creating Child Class
public class Bike extends Vehicle{
	public static void main(String[] args) {
		
		//Creating an Instance of Child class
		Bike ref = new Bike();
		
		//Calling the method with child class instance
		ref.run();
	}
}