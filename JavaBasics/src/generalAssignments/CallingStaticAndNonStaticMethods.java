package generalAssignments;

public class CallingStaticAndNonStaticMethods {
	public static void main(String args[])
	{
		CallingStaticAndNonStaticMethods obj = new CallingStaticAndNonStaticMethods();
		obj.add();
		sub();
		obj.mul();
		double totalPrice = obj.bookPrice();
		System.out.println("Total Price of the books are: "+ " "+totalPrice);
	}
	public void add()
	{
		System.out.println("This is a Non Static Metho");
	}
	public static void sub()
	{
		System.out.println("This is a Static Method");
	}
	public int mul()
	{
		int a = 2;
		int b = 2;
		int c = a*b;
		System.out.println(c);
		return c;
	}
	public double bookPrice()
	{
		double book1Price = 5.5;
		double book2Price = 4.6;
		double price = book1Price+book2Price;
		return price;
	}

}
