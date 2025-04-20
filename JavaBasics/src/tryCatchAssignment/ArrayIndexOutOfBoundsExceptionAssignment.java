package tryCatchAssignment;

public class ArrayIndexOutOfBoundsExceptionAssignment {
	public static void main(String args[]) {
		
		int arr[] = {10,20,30};
		
		try {
			System.out.println("Values in the array are: "+arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please check the array size");
			System.out.println(e.getMessage()); 
		}
		
	}

}
