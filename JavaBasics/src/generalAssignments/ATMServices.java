package generalAssignments;
import java.util.Scanner;
//ATM Services
public class ATMServices {
	public static void main(String args[]) {
		double balance = 10000;//Initial Balance
		int choice; //To enter choice
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("-------------ATM Services --------------");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
		
		System.out.println("Enter Choice");
		choice = sc.nextInt();
				
		switch (choice) {
		
		case 1: 
			System.out.println("Entered Choice is: "+choice);
			System.out.println("Current Balance is: "+balance);
			break;
			
		case 2:
			System.out.println("Entered Choice is: "+choice);
			System.out.println("Entered Amount");
			double amount = sc.nextDouble();
			balance +=amount;
			System.out.println("Balance after deposit is: "+balance);
		    break;
		    
		case 3:
			System.out.println("Entered Choice is: "+choice);
			System.out.println("Enter amount to withdraw");
			double withdraw;
			withdraw= sc.nextDouble();
			balance-=withdraw;
			System.out.println("Balance after withdraw is: "+balance);
			break;
			
		case 4:
			System.out.println("You have entered Exit, Bye Bye");
			break;
			
		default:
			System.out.println("Enter Valid entry from 1 to 4");
	}
		}
		while(choice !=4);
		sc.close();
}	
}
