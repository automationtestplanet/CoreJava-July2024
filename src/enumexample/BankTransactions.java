package enumexample;

public class BankTransactions {

	static int bankBalanceAmount = 0;

	void deposit(AccountType accountType, int depositAmount) {

		switch (accountType) {
		case SAVINGS:
			if (depositAmount <= 200000)
				bankBalanceAmount = bankBalanceAmount + depositAmount;
			else
				System.out.println("Deposit more than 200000 not allowed for Savings account");
			break;

		case CURRENT:
			if (depositAmount <= 1000000)
				bankBalanceAmount = bankBalanceAmount + depositAmount;
			else
				System.out.println("Deposit more than 1000000 not allowed for Current account");
			break;
		case RETAIL:
			if (depositAmount <= 2000000)
				bankBalanceAmount = bankBalanceAmount + depositAmount;
			else
				System.out.println("Deposit more than 2000000 not allowed for Retail account");
			break;
		default:
			break;
		}

	}

	void withdrawl(AccountType accountTye, int withdrawlAmount) {

		switch (accountTye) {
		case SAVINGS:
			if (withdrawlAmount <= bankBalanceAmount)
				if (withdrawlAmount <= 50000)
					bankBalanceAmount = bankBalanceAmount - withdrawlAmount;
				else
					System.out.println("Transaction Declined..., Withdrawl limit for savings account 50000");
			else
				System.out.println("Insufficent Balance");
			break;

		case CURRENT:
			if (withdrawlAmount <= bankBalanceAmount)
				if (withdrawlAmount <= 200000)
					bankBalanceAmount = bankBalanceAmount - withdrawlAmount;
				else
					System.out.println("Transaction Declined..., Withdrawl limit for current account 200000");
			else
				System.out.println("Insufficent Balance");
			break;

		case RETAIL:
			if (withdrawlAmount <= bankBalanceAmount)
				if (withdrawlAmount <= 500000)
					bankBalanceAmount = bankBalanceAmount - withdrawlAmount;
				else
					System.out.println("Transaction Declined..., Withdrawl limit for retail account 500000");
			else
				System.out.println("Insufficent Balance");
			break;

		default:
			break;
		}

	}

	void displayBalance() {
		System.out.println(bankBalanceAmount);
	}

	public static void main(String[] args) {

		BankTransactions ammerpetBranch = new BankTransactions();

		ammerpetBranch.deposit(AccountType.SAVINGS,100000);
		ammerpetBranch.displayBalance();

		BankTransactions kotiBranch = new BankTransactions();

		kotiBranch.withdrawl(AccountType.SAVINGS,5000);

		kotiBranch.displayBalance();

		kotiBranch.withdrawl(AccountType.RETAIL,100000);

		kotiBranch.displayBalance();
		
		kotiBranch.withdrawl(AccountType.SAVINGS,50000);
		kotiBranch.displayBalance();

	}

}
