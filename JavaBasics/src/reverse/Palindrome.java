package reverse;

public class Palindrome {
	public static void main(String args[]) {
		//Create a string -- Example of Palnidrome strings are Madam, Level, etc
		String palni = "level";
		//Reverse the string using String Builder
		String reverse = new StringBuilder(palni).reverse().toString();
		//Write a condition to check if the given string is Palinidrome or not
		if(palni.equalsIgnoreCase(reverse)) {
			System.out.println("The given string is Palnidrome : "+reverse);			
		} else
		{
			System.out.println("The given string is Not Palnidrome : "+reverse);
		}
	}
}
