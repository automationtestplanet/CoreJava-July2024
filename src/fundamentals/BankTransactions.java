package fundamentals;

public class BankTransactions {

	static int bankBalanceAmount = 0;

	void deposit(int depositAmount) {
		bankBalanceAmount = bankBalanceAmount + depositAmount;
	}

	void withdrawl(int withdrawlAmount) {
		if (withdrawlAmount <= bankBalanceAmount)
			bankBalanceAmount = bankBalanceAmount - withdrawlAmount;
		else
			System.out.println("Insufficent Balance");
	}

	void displayBalance() {
		System.out.println(bankBalanceAmount);
	}

	public static void main(String[] args) {

		BankTransactions ammerpetBranch = new BankTransactions();

		ammerpetBranch.deposit(100000);
		ammerpetBranch.displayBalance();

		BankTransactions kotiBranch = new BankTransactions();

		kotiBranch.withdrawl(5000);

		kotiBranch.displayBalance();

		kotiBranch.withdrawl(100000);

		kotiBranch.displayBalance();

	}

}
