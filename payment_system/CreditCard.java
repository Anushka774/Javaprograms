package payment_system;

public class CreditCard extends Payment
{
   public CreditCard(double amount, String transactionID) 
   {
		super(amount, transactionID);
		
	}

    double amountcd=super.getAmount();
     double feerate=(0.02*amountcd);
   
     double payableam=0;
     double finalpayable=0;
     double discount=0.1*amountcd;
   
   
   public void processPayment()
   {
	   if(amountcd>500)
	   {
		   payableam=amountcd-(discount);
	   }
	   
	   else 
		   payableam=amountcd;
	   
	   finalpayable=payableam+feerate;
	   
	   System.out.println("-------CreditCard Transaction Information-------");
	   System.out.println("Transacion ID: " + super.gettransactionID());
	   System.out.println("Original Amount: " + amountcd+"$");
	   System.out.println("Discount applied: " + discount +"$");
	   System.out.println("Transaction fee: " + feerate+"$");
	   System.out.println("Final payable amount: " + finalpayable+"$");
	   System.out.println("CreditCard payment successful!");
	   
	   
   }
}
