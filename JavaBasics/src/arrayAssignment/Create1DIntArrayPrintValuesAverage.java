package arrayAssignment;
//Write a Java program to calculate the average of all integers in the array.{15,25,35,45,55}
//Follow these steps to calculate the average:
//Calculate the sum of all elements in the array.
//Divide the sum by the number of elements in the array to compute the average.
//Print the following:
//The array elements
//The sum of the elements
//The average of the elements

public class Create1DIntArrayPrintValuesAverage {
	public static void main(String args[])
	{
		int arr[] = {15,25,35,45,55};
		int sum=0;
		double average=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];			
		}
		average = (double)sum/arr.length;
		System.out.println("The array elements are:"+ " "+arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]+", "+arr[4]);
		System.out.println("The sum of the elements are:"+ " "+sum);
		System.out.println("The average of the elements:"+ " "+average);
	}

}
