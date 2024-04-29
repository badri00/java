package Account;

public class Account {
	String TransactionDate;
	String Narration;
	double WithdrawalAmount;
	double DepositAmount;
	
	
	public Account(String transactionDate, String narration, double withdrawalAmount, double depositAmount) {
		super();
		TransactionDate = transactionDate;
		Narration = narration;
		WithdrawalAmount = withdrawalAmount;
		DepositAmount = depositAmount;
	}
	
	
	@Override
	public String toString() {
		return "Account [TransactionDate=" + TransactionDate + ", Narration=" + Narration + ", WithdrawalAmount="
				+ WithdrawalAmount + ", DepositAmount=" + DepositAmount + "]";
	}
	
	
	public String getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}
	public String getNarration() {
		return Narration;
	}
	public void setNarration(String narration) {
		Narration = narration;
	}
	public double getWithdrawalAmount() {
		return WithdrawalAmount;
	}
	public void setWithdrawalAmount(double withdrawalAmount) {
		WithdrawalAmount = withdrawalAmount;
	}
	public double getDepositAmount() {
		return DepositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		DepositAmount = depositAmount;
	} 
	
	
	
	
}
