package interfacesAssignments;

public class CITIBank implements RBI{
	public void kyc()
	{
		System.out.println("CITI Bank KYC");
	}
	
	public void getAadhar()
	{
		System.out.println("CITI Bank Get Aadhar Card");
	}
	
	public void checkResidency()
	{
		System.out.println("CITI Please check Customer Residency");
	}
	
	public void calculateInterest()
	{
		int citiInterest = RBI.interestRate * 10000 / 100;
		System.out.println("CitiBank Interest is : "+" "+citiInterest);
	}

}
