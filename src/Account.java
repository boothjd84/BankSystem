
public class Account {
	private double balance;
	
	public Account(){
		balance = 1000.0;
	}
	public void credit(double amt){
		balance += amt;
	}
	public void debit(double amt){
		balance -= amt;
	}
	public double getBalance(){
		return balance;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
