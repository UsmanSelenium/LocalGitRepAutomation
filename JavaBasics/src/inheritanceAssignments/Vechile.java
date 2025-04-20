package inheritanceAssignments;
//Create Base Class
public class Vechile {
	String brand;
	int speed;	

	public void generalDetails()
	{
		System.out.println("Vehicle Brand:"+" "+brand);
		System.out.println("Maximum Speed:"+" "+speed);
	}

}

class Car extends Vechile {
	String model;

	public void specificDetails()
	{
		System.out.println("Car Model:"+" "+model);
	}

	public static void main(String args[]) {
		Car carobj = new Car();

		carobj.brand="Maruti"; 
		carobj.speed=80;
		carobj.model="Swift";

		carobj.generalDetails();
		carobj.specificDetails();
	}

}