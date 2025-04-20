package arrayAssignment;
import java.util.Scanner;
/*A teacher wants to enter the marks of N students in a subject. The program should:
1.	Accept the number of students. 2.	Store their marks in an array.
3.	Calculate and print the total and average marks.
Requirements:
•	Use Scanner to take input.•	Store marks in an int array. Use a for loop to take input and calculate the total.
•	Display total marks and average marks.
 * */
public class StudentMarks {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Students: ");
//Store marks in an int array.
		int noStuds = sc.nextInt();
		int marks[] = new int[noStuds];
//Use a for loop to take input and calculate the total.
		int totalMarks = 0;
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter Marks: "+(i+1));
			marks[i] = sc.nextInt();
			totalMarks +=marks[i];
		}
//Display total and average
		System.out.println("Total Marks are: "+totalMarks);
		int avgMarks = totalMarks/noStuds;
		System.out.println("Average Marks are: "+avgMarks);
		sc.close();
	}
}
