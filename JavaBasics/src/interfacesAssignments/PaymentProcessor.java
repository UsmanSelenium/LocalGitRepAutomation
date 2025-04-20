package interfacesAssignments;

public interface PaymentProcessor {
//Interface Variables
	double MIN_TRANSACTION_AMOUNT = 1.0;
	double MAX_TRANSACTION_AMOUNT = 100000.0;
	String CURRENCY = "INR";
	
	boolean validatePayment(double amount);
	void processPayment(double amount);
	void printReceipt(String transactionId, double amount);
}
