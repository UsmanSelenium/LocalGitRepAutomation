package scannerAssignment;

import java.time.LocalDate;
import java.util.Scanner;

/*Write a Java program that does the following:
Prompt the user to enter their first name and last name.
Ask the user for their current age.
Calculate the year the user was born (assuming the current year is provided or hard-coded in the program).
Display a personalized greeting along with the calculated birth year.
 * 
 * */
public class ScGreetingAgeCalculator {
	public static void main(String args[]) {
//Create an Object of Scanner Class
		Scanner sc = new Scanner(System.in);
//Prompt the user to enter their first name and last name
		System.out.println("Enter your First Name");
		String firstName = sc.next();
		
		System.out.println("Enter your Last Name");
		String lastName = sc.next();
		
//Ask the user for their current age
		System.out.println("Enter your current Age");
		int age = sc.nextInt();

//Ask the user to enter his Gender M/F
		System.out.println("Enter Gender");
		char gender = sc.next().charAt(0);
		
// Get the current year using LocalDate
		int currentYear = LocalDate.now().getYear();
		System.out.println("Current year is "+currentYear);
		
//Calculate birth year
		int birthYear = currentYear - age;
		
//Display a personalized greeting along with the calculated birth year
		System.out.println("Your Birth year is "+birthYear);
			
		sc.close();
	}
}
