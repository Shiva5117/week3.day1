package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit(String depositName) {
		System.out.println("Deposited person name: "+depositName);
	}

	public static void main(String[] args) {
		//Creating Object for BankInfo class
		BankInfo info = new BankInfo();
		System.out.println("Bank Informations:");
		info.deposit(10000);
		info.saving(123456);
		info.saving(98643);
		
		//Creating object for AxisBank class
		AxisBank axis = new AxisBank();
		System.out.println("\nAxis Bank:");
		axis.deposit("Soorya");

	}

}
