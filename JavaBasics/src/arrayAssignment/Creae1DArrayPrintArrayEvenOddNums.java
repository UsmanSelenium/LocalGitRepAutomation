package arrayAssignment;
//Create a program to generate an array of integers containing values from 1 to 50.
//Write logic to separate even numbers and odd numbers from the generated array:
//Create a separate array to store even numbers.
//Create another array to store odd numbers.
//Print the following:
//The original array (values from 1 to 50).
//The even numbers array.
//The odd numbers array.

public class Creae1DArrayPrintArrayEvenOddNums {
	public static void main(String args[])
	{
		int arr[] = new int[50];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= i+1;
//			System.out.println("The original array "+" "+arr[i]);
//			if(arr[i]/2 == 0)
//			{
//				System.out.println("The even numbers array"+" "+arr[i]);
//			}
//			else
//			{
//				System.out.println("The Odd numbers array"+" "+arr[i]);
//			}
		}
		
	}

}
