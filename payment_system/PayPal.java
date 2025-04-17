package payment_system;

public class PayPal extends Payment
{
   public PayPal(double amount, String transactionID) 
   {
		super(amount, transactionID);
		
	}

    double amountcd=super.getAmount();
     double feerate=0.03*super.getAmount();
   
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
	   
	   finalpayable=payableam-feerate;
	   
	   System.out.println("--------PayPal Transaction Information--------");
	   System.out.println("Transacion ID: " + super.gettransactionID());
	   System.out.println("Original Amount: " + amountcd+"$");
	   System.out.println("Discount applied: " + discount +"$");
	   System.out.println("Transaction fee: " + feerate+"$");
	   System.out.println("Final payable amount: " + finalpayable+"$");
	   System.out.println("PayPal payment successful!");
	   
	   
   }
}
