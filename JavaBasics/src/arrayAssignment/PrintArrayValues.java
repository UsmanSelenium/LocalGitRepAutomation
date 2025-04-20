package arrayAssignment;
//Write a program to print all elements of an array using a for loop.
public class PrintArrayValues {
	public static void main(String args[]) {
		
//Create an Array with with a fixed size of 3 elements.
		int[] numbersArray = new int[3];
//Assign values to Array
		numbersArray[0] = 10;
		numbersArray[1] = 30;
		numbersArray[2] = 50;
//Create Array and initialized with the values 10, 20, and 30. 
		int[] numArr = {100,200,300};
//Print the numbers using for loop. 
//If the Initialization value is 0 then your condition should have "<arrayname.Length"
//If the Initialization value is 1 then your condition should have "<=arrayname.Length"
		for(int i=0;i<numbersArray.length;i++)
		{
			System.out.println("The values in the Array are: "+numbersArray[i]);
		}
//Print the values using For-Each loop
		for(int arrayValues: numArr)
		{
			System.out.println("Array values using For-Each Loop are: "+arrayValues);
		}
		
	}

}
