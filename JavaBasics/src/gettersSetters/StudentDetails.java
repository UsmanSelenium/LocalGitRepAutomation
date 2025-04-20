package gettersSetters;

public class StudentDetails {
		public static void main(String args[]) {
			
			GetterAndSetters obj = new GetterAndSetters();
			obj.setsID(7);
			obj.setsName("Usman");
			obj.setsClassName("MBA");
			
			System.out.println("Name is: " + obj.getsName() + 
	                ", Class is: " + obj.getsClassName() + 
	                ", Roll No is: " + obj.getsID());
		}
		
	}



