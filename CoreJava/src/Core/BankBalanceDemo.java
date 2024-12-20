package Core;

public class BankBalanceDemo {

	public static void main(String[] args) {
		int balance=45000;
		try {
			if(balance<50000)
			{
				throw new BankBalanceException("Balance must be greater than 50000");
			}
			else 
			{
				System.out.println("balance is enough");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
