package bank;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Deposit through NEFT transfer");
	}

	public static void main(String[] args) {
		
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();//overrides method
		// TODO Auto-generated method stub

	}

}
