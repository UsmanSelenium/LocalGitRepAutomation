package interfacesAssignments;

public class BankingSystem {
	public static void main(String args[])
	{
		CITIBank citi = new CITIBank();
		citi.kyc();
		citi.getAadhar();
		citi.calculateInterest();
		citi.checkResidency();
		
		HDFCBank hdfc = new HDFCBank();
		hdfc.kyc();
		hdfc.getAadhar();
		hdfc.deposit();
	}

}
