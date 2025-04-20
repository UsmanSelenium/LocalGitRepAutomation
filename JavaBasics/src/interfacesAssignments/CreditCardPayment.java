package interfacesAssignments;

public class CreditCardPayment implements PaymentProcessor{
	
	public boolean validatePayment(double amount)
	{
		if(amount >= MIN_TRANSACTION_AMOUNT && amount <= MAX_TRANSACTION_AMOUNT)
		{
			System.out.println("Transaction Valid");
			return true;
		} else
		{
			System.out.println("Transaction Invalid");
			return false;
		}
		
	} 
	
	public void processPayment(double amount) 
	{
        if (!validatePayment(amount)) return;
        System.out.println("Credit Card Payment Processed Successfully.");
    }

	public void printReceipt(String transactionId, double amount) {
		
		System.out.println("Receipt -> Transaction ID: " + transactionId + " | Amount: " + amount + " | Currency: " + CURRENCY);
		
	}

}
