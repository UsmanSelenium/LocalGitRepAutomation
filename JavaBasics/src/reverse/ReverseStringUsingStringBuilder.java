package reverse;

public class ReverseStringUsingStringBuilder {
	public static void main(String args[]) {
		//Create a String
		String str = "Selenium";
		//Unlike String, StringBuilder is mutable (can be modified without creating new objects).
		//Create String Builder oBject and use reverse method 
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed String is : "+ reversed);
	}

}
