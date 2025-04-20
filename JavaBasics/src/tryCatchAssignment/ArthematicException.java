package tryCatchAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArthematicException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);		
		try {
		System.out.println("Enter First Number: ");
		int fNum = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int sNum = sc.nextInt();
//Formula for dividing the numbers
		int tNum = fNum/sNum;
		System.out.println("Divided results is: "+tNum);
		}		
		catch(ArithmeticException e) {
			System.out.println("Zero's are not divided, Please enter valid number.");
		}	
//Catch block for input mismatch
		catch(InputMismatchException e) {
			System.out.println("Only Integers allowed. Input Mismatch Exception");
		}
		finally {
			sc.close();
			System.out.println("Closing Program");
		}
	}
}
