package atm;

public class atm {
	public atm() {
		super();
	}
	@Override
	public String toString() {
		return "atm [balance=" + balance + ", depositeAmount=" + depositeAmount + ", withdrawAmount=" + withdrawAmount
				+ "]";
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositeAmount() {
		return depositeAmount;
	}
	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	private double balance;
	private double depositeAmount;
	private double withdrawAmount;

}
