package arrayAssignment;
//Declare and initialize a 1D integer array {10, 20, 30, 40, 50}
//Write a Java program to calculate the sum of all integers in the array.
//Use an appropriate method to calculate the sum, and store the result in a variable.
//After calculating the sum, print the following:
//The array elements
//The sum of all integers

public class Create1DArrayPrintValuesUsingForLoop {
	public static void main(String args[])
	{
		int arr[] = {10,20,30,40,50};
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		System.out.println("The array elements:"+" "+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]);
		System.out.println("The sum of all integers:"+" "+sum);
	}

}
