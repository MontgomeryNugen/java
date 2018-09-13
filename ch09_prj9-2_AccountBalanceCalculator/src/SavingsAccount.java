
public class SavingsAccount extends Account {

	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	//user can't establish an account without a balance,
	public SavingsAccount(double balance) {
		setBalance(balance);
		this.monthlyInterestRate = .01;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}

	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	
	public void applyInterestPayment() {
		// determine what the monthly interest pymt is
		double mip = balance * monthlyInterestRate;
		//set monthlyInterestPayment
		setMonthlyInterestPayment(mip);
		//add mip to balance
		balance += mip;
	}
	
	
}
