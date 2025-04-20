package Polymorphism;

public class PolymorphismMOverLoading {
	public static void main(String args[])
	{
		PolymorphismMOverLoading obj = new PolymorphismMOverLoading();
		
		obj.add(10, 20, 30);
		obj.add(10.1, 20);
		obj.add(33.3, 10);
	}
//Create Same Name Method with diff Signatures
	public void add(int d, int e, int f)
	{
		int g = d+e+f;
		System.out.println("Method with diff in No of Arguments"+ " "+g);
	}
	public void add(double f, int d)
	{
		double h = f+d;
		System.out.println("Method with diff Arguments"+ " "+h);
	}
	public void add(int d, double f)
	{
		double i = f+d;
		System.out.println("Method with diff Order of Arguments"+ " "+i);
	}

}
