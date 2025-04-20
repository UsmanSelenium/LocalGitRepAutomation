package stringAssignment;
//Declare a string variable with a value of your choice. For example: String input = "Selenium WebDriver";
//Convert the string into a character array using the toCharArray() method.
//Hint: Use the following method to get the character array:
//char[] charArray = input.toCharArray();
//Write a program to reverse the string by iterating through the character array from the last index to the first index.
//Print the reversed string.
//Example Output:
//For the input string "Selenium WebDriver", the output should be:
//Original String: Selenium WebDriver
//Reversed String: revirDbeW muineleS

public class ReverseString {
	public static void main(String args[])
	{
		String input = "Selenium WebDriver";
		
		char[] charArray = input.toCharArray();
		
		for(int i = charArray.length -1; i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
		
	}

}
