package generalAssignments;

public class MethodsCreation {
	//Instance / Class Variables
			int num1 = 10;
			int num2 = 20;
			int num4;
			int num5;
			int num3;
			int num6;
	public static void main(String args[])
	{
		MethodsCreation mc = new MethodsCreation();
		mc.add();
		mc.num4 = 20;
		mc.num5 = 10;
		mc.sub();
	}

	public void add()
	{
		num3 = num1+num2;
		System.out.println(num3);
	}
	
	public void sub()
	{
		num6 = num4-num5;
		System.out.println(num6);
	}
	
}
