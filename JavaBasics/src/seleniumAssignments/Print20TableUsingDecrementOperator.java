package seleniumAssignments;
//Write a Java program that prints the multiplication table of 20 from 20 × 10 down to 20 × 1 using a for loop.
public class Print20TableUsingDecrementOperator {
	public static void main(String args[])
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println("20 x"+" "+i+" "+"="+" "+(20*i));
		}
	}

}
