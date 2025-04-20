package assignments;

public class SwitchCaseGrade {
	public static void main(String args[])
	{
//Initiate and declare marks variable
		int marks = 66;
//Divide the marks with 10 to get the grade
		int grades = marks/10;
//Write Switch Case Based on Marks
		switch (grades) {
		case 10: 
		{
			System.out.println("Grade A+");
		}
		break;
		case 9:
		{
			System.out.println("Grade A+");
		}
		break;
		case 8:
		{
			System.out.println("Grade A");
		}
		break;
		case 7:
		{
			System.out.println("Grade B+");
		}
		break;
		case 6:
		{
			System.out.println("Grade B");
		}
		break;
		case 5:
		{
			System.out.println("Grade C");
		}
		break;
		case 4:
		{
			System.out.println("Grade D");
		}
		break;
					
		default:
			System.out.println("Fail");;
		}
	}

}
