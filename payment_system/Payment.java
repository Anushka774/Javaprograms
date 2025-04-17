package payment_system;

public abstract class Payment 
{
	private double amount;
	private String transactionID;
	
	public Payment(double amount, String transactionID)
	{
		this.setAmount(amount);
		this.settransactionID(transactionID);
	}
	
	
    abstract void processPayment();


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
    
   public String gettransactionID()
   {
	   return transactionID;
   }
   
   public void settransactionID(String transactionID)
   {
	   this.transactionID=transactionID;
   }
}
