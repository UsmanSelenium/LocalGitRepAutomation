package arrayAssignment;

public class PrintArrayIntValues {
	public static void main(String args[]) {
		int [] nArr = new int [3];
	//Assign values
		nArr[0] = 15;
		nArr[1] = 25;
		nArr[2] = 35;
	//Declare one more array
		int[] numArr = {10, 20, 30};
	//for loop
		for(int i=0;i<nArr.length;i++) {
			System.out.println("Values from for loop are: "+nArr[i]);
		}
	//for-each loop
		for(int numbers: numArr) {
			System.out.println("Values from for-each lopp are: "+numbers);
		}
	}

}
