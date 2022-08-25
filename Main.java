public class Main {

	public static void main(String[] args) {
		
	 	Account acc1 = new FixedDepositAccount();//fixed deposit object
		SavingAccount acc2 = new SavingAccount();//savingAccount object
		
		acc1.deposit(10000);
		
		acc2.deposit(5000);
		acc2.withdraw(300.0);

    		acc1.display();
		acc2.display();
		
  	}

}
