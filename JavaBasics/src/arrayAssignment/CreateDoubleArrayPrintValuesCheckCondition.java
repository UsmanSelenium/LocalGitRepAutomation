package arrayAssignment;
//Declare a double array with the following hard-coded values: 10.0, 20.0, 30.0, 40.0, 50.0
//Calculate the sum of all elements in the array manually (without using a loop).
//Store the sum in a variable and print the result.
//After printing the sum, use an if-else condition to check the sum:
//If the sum is less than 150, print: The sum is less than 150.
//If the sum is greater than or equal to 150, print: The sum is greater than or equal to 150.

public class CreateDoubleArrayPrintValuesCheckCondition {
	public static void main(String args[])
	{
		double arr[] = {10.0, 20.0, 30.0, 40.0, 50.0};
		System.out.print("Array values :"+" "+arr[0]+", "+arr[1]+", "+ arr[2]+", "+ arr[3]+", "+ arr[4]);
		System.out.println();
		
		double sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		System.out.println("Sum of all array elements : "+ " "+sum);
		
		if(sum<150)
		{
			System.out.println("Sum is Less than 50"+" "+sum);
		}
		else
		{
			System.out.println("Sum is Greater than 50"+" "+sum);
		}
	}

}
