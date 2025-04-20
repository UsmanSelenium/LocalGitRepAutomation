package arrayAssignment;

public class PrintArrayStringValues {
	public static void main(String args[]) {
//Declare and Initialize an String Array with values/elements
		String vArry[] = {"Apple","Orange","Grape"};
//Use for loop to pint the elements
		for(int i=0;i<vArry.length;i++) {
			System.out.println("Values of String Array using for Loop: "+vArry[i]);
		}
//Declare and Initialize another String Array with values/elements
		String mArr[] = {"TVS","Bajaj","Honda"};
//Use for each loop to print the array elements
		for(String motorArr: mArr) {
			System.out.println("Values of String Array using for-each loop: "+motorArr);
		}
	}
}
