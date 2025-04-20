package generalAssignments;

public class AccessingClassVariables {
	String name;
	String email;
	
	public static void main(String args[])
	{
//Create an object to Student1 Method
		AccessingClassVariables obj = new AccessingClassVariables();
		obj.student1();
		String mainMethodVar = obj.email = "Rakesh";
		System.out.print("Main Method Var"+" "+mainMethodVar);
	}
//Create a Method
	public void student1()
	{
		name = "Usman";
		email = "usman@abc.com";
		System.out.println("Name of Student1 : "+ " "+name);
		System.out.println("Email of Student1 : "+ " "+email);
	}
	

}
