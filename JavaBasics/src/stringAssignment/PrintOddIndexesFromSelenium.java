package stringAssignment;
//Declare a string variable as String input = "Selenium";
//Write a program to print all odd-indexed characters from the string.
//Consider the index to start from 0.
//Odd-indexed characters are those at indices 1, 3, 5, ...
//Print the result in the following format: Odd-indexed characters: e, i, u

public class PrintOddIndexesFromSelenium {
	public static void main(String args[])
	{
		String input = "Selenium";
		
		for(int i=0;i<input.length();i++)
		{
			if(i%2 != 0)
			{
				System.out.print(input.charAt(i));
				if(i+3 < input.length())
				{
					System.out.print(", ");
				}
			}
		}
	}

}
