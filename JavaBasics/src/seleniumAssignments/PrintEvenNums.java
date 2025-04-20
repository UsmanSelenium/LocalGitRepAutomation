package seleniumAssignments;
//write a program to print 1 to 100 and check whether the number is even and print it
public class PrintEvenNums {
	public static void main(String args[])
	{
		for(int i=1; i<=100;i++) 
		{
		System.out.println(i);
		if(i %2==0)
		{
			System.out.println("The Even Num is : "+ " "+i);
		}
	}

	}
}
