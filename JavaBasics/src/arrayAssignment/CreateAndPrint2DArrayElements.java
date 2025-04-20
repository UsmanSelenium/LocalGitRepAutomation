package arrayAssignment;

public class CreateAndPrint2DArrayElements {
	public static void main(String args[]) {
//initialize and Declare 2D Array
		int twodArr[] [] = {
				{1,2,3}, 
				{10,20,30},
				{100,200,300}
				};
//Use for loop to print the values
		//Outer for loop to print values from Rows
			for(int i=0;i<twodArr.length;i++) {
		//Print a line so that the elements get printed after each row and column
			System.out.println();
		//Inner loop to print Values from Columns. Here you need to take outer loop[value].length 	
			for(int j=0;j<twodArr[i].length;j++) {
		//Print Rows and Columns Values
			//System.out.println("Values of Rows and Columns: "+twodArr[i][j]+"\t");
			System.out.print(twodArr[i][j]+"\t");
			}
		}
	}
}
