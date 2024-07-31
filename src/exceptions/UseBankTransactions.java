package exceptions;

import enumexample.AccountType;

public class UseBankTransactions {
	public static void main(String[] args) throws BankTransactionException {

		BankTransactions ammerpetBranch = new BankTransactions();

		ammerpetBranch.deposit(AccountType.SAVINGS, 100000);
		ammerpetBranch.displayBalance();

		BankTransactions kotiBranch = new BankTransactions();

		kotiBranch.withdrawl(AccountType.SAVINGS, 5000, 1123);

		kotiBranch.displayBalance();

		kotiBranch.withdrawl(AccountType.RETAIL, 80000, 1123);

		kotiBranch.displayBalance();

		kotiBranch.withdrawl(AccountType.SAVINGS, 50000, 5678);
		kotiBranch.displayBalance();
	}

}
