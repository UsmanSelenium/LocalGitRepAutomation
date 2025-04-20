package seleniumAssignments;
//Write a Java program that calculates the sum and average of the first 10 natural numbers using a for loop.
//Use a for loop to iterate from 1 to 10 and calculate the sum of these numbers.
//Calculate the average by dividing the sum by 10 (since there are 10 numbers).
//Print both the sum and the average.

public class CalculateSumAndAverage {
	public static void main(String args[])
	{
		int sum = 0;
		double average = 0;
		for (int i=1;i<=10;i++)
		{
			sum +=i;
			average = (double)sum/10;			
		}
		System.out.println("Sum is :"+ " "+sum);
		System.out.println("Average is"+ " "+average);
	}

}
