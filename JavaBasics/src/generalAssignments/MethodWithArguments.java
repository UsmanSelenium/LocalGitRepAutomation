package generalAssignments;

public class MethodWithArguments {
	public static void main(String args[])
	{
//Create object to call the class methods
		MethodWithArguments obj = new MethodWithArguments();
		
		int addResult = obj.add(10, 20);
		System.out.println(addResult);
		
		obj.sub(3.3, 2.2);
		
		String stringResult = obj.names("Usman", "Ali");
		System.out.println(stringResult);
	}
	public int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	public String names(String d, String e)
	{
		String f = d+e;
		return f;
	}
	public void sub(double i, double j)
	{
		double k = i-j;
		System.out.println("Subracted value from Sub Method is:"+" "+k);
	}

}
