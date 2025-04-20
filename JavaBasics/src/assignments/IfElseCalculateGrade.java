package assignments;

public class IfElseCalculateGrade {
	public static void main(String args[])
	{
//Initialize and Declare 3 Variables
		int maths = 85;
		int science = 90;
		int english = 78;
//Calculate the percentage. Ini and Declare percentage variable
		double percentage = (science + english + maths) / 3.0;
//Write the condition to print the grades
		if (percentage >= 90 && percentage <=100)
		{
			System.out.println("Grade A");
		}
		else if (percentage >=80 && percentage <=89)
		{
			System.out.println("Grade B");
		}
		else if (percentage >=70 && percentage <=69)
		{
			System.out.println("Grade C");
		}
		else if (percentage >=60 && percentage <=69)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
