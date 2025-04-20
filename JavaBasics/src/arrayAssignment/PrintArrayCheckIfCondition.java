package arrayAssignment;
//Declare an integer array with five elements: 15, 25, 35, 45, 65.
//Print each element of the array manually without using a loop.
//Add the first and last elements of the array and store the result in a variable.
//Use an if-else condition to check if the sum of the first and last values is less than 100.
//If the sum is less than 100, print: The sum is less than 100.
//If the sum is greater than or equal to 100, print: The sum is greater than or equal to 100.

public class PrintArrayCheckIfCondition {
	public static void main(String args[])
	{
		int arr[] = {15,25,35,45,65};
		System.out.println("First Element" + " " + arr[0]);
		System.out.println("Second Element" + " " + arr[1]);
		System.out.println("Third Element" + " " + arr[2]);
		System.out.println("Fourth Element" + " " + arr[3]);
		System.out.println("Fifth Element" + " " + arr[4]);
		
		int flSum = arr[0]+arr[4];
		System.out.println("Actual Sum is: "+ " "+ flSum);
		
		if(flSum<100)
		{
			System.out.println("The sum is Less than 100." +" "+ "Actual Sum is :"+ " "+flSum);
		}
		else
		{
			System.out.println("The sum is Greater than 100" + "Actual Sum is :"+ " "+flSum);
		}
	}

}
