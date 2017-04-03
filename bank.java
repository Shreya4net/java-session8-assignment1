

public class bank {
	public static void main (String[]args){
MyBankatm myatm=new MyBankatm("SBI","patna",12345,1000);
System.out.println(myatm);
try {
	myatm.debit(10000);
} catch (InvalidAmountException e) {
	System.out.println("Invalid amount:" +e);
	
}
System.out.println(myatm);
	}
}
class MyBankatm{
	String bankname;
	String location;
	int atmid;
	int balance;
	public MyBankatm(String bankname,String location,int atmid,int balance){
		super();
		this.bankname=bankname;
		this.location=location;
		this.atmid=atmid;
		this.balance=balance;

	}
void debit(int amount) throws InvalidAmountException{
	if (balance<amount)
		throw new InvalidAmountException();
	
	balance-=amount;
}
@Override
public String toString() {
	return "MyBankatm [bankname=" + bankname + ", location=" + location + ", atmid=" + atmid + ", balance=" + balance + "]\n";
}

}
class InvalidAmountException extends Exception{
	private String message;

	public InvalidAmountException() {
		super("balance is less than amount being withdrawn...");
		message="balance is less than amount being withdrawn...";
		
		 
	

	}
	
}