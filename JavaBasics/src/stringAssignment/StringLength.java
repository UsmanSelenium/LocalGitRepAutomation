package stringAssignment;
//Declare a string variable with the value "Selenium WebDriver".
//Write a program to measure the length of the string using the length() method.
//Use an if-else statement to classify the string based on its size:
//If the string length is less than 8, print: String is very small. Otherwise, print: String is big

public class StringLength {
	public static void main(String args[])
	{
		String value = "Selenium WebDriver";
		int vLength = value.length();
		
		System.out.println("string length is"+ " "+vLength);
		
		if(vLength<8)
		{
			System.out.println("String is very small");
		}
		else
		{
			System.out.println("String is big");
		}
	}

}
