package generalAssignments;

public class ValidateUsers {
	public static void main(String args[]) {
		String userName = "admin";
		String pwd = "Root";
		
	String[] givenUN = {"Badmin","Admin","Dadmin"};
	String [] givenPwd = {"Ghoot","Root","Boot"};
	
	boolean isValid = false;
	
	for(int i=0;i<givenUN.length;i++) {
		if(givenUN[i].equalsIgnoreCase(userName) && givenPwd[i].equalsIgnoreCase(pwd)) {
			System.out.println("Valid Credentials");
			isValid = true;
			break;
		}
	}
	if(!isValid) {
		System.out.println("Invalid Credintals, Please enter correct credentials");
	}
	}

}
