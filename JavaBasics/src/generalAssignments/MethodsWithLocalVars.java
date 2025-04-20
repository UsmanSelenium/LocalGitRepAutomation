package generalAssignments;

public class MethodsWithLocalVars {
	public static void main(String args[])
	{
		MethodsWithLocalVars mulobj = new MethodsWithLocalVars();
		mulobj.mul();
	}
	public int mul()
	{
		int mul1 = 10;
		int mul2 = 20;
		int mul3 = mul1*mul2;
		System.out.println(mul3);
		return mul3;
	}

}
