package arrayAssignment;

public class CreateAndPrint2DArrayElementsFixedSize {
	public static void main(String args[]) {
//Declare 2D Array with fixed elements with Constructor
		int numArr[][] = new int[2][3];
//Initialize the elements/values to 2D Array
		numArr[0][0]=10;
		numArr[0][1]=20;
		numArr[0][2]=30;
		
		numArr[1][0]=100;
		numArr[1][1]=200;
		numArr[1][2]=300;
//Print the elements of Array
//Write outer loop for rows
		for(int rows=0;rows<numArr.length;rows++) {
		//Write print statement so that a new line will be printed after each row
			System.out.println();
//Write Inner Loop for Columns
		for(int columns=0;columns<numArr[rows].length;columns++) {
			System.out.print(numArr[rows][columns]+"\t");
		}
		}
		
	}

}
