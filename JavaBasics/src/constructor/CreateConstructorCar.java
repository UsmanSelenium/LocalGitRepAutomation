package constructor;

public class CreateConstructorCar {
	String brand;
	int year;
//Constructor without parameters
//Class name and Constructor Name should be same
	CreateConstructorCar() {
		this.brand = brand;
		this.year = year;
	}
	
//Constructor with Arguments
	CreateConstructorCar(String brand) {
		this.brand=brand;
		this.year=2025;
	}

//Create display method
	public void display() {
		System.out.println("Car brand is: "+brand+"  and the model year is "+year);
	}

//Now write a Main program
	public static void main(String args[]) {
		
//Create an object of Class CreateConstructorCar to access the constructors and methods
//Calling Constructor without arguments
		CreateConstructorCar car1 = new CreateConstructorCar();
		car1.brand="Honda"; //You can provide the values to variable after calling Constructor without arguments
		car1.year=2025; //You can provide the values to variable after calling Constructor without arguments
		car1.display(); //You can call the class method using Constructor name
		
//Calling Constructor with 1 Argument
		CreateConstructorCar car2 = new CreateConstructorCar("Ford");//Calling constructor with 1 argument
		car2.year=2024;//Provinding value to the variables with constructor name
		car2.display();
	}
}
