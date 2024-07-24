package exceptions;

import enumexample.AccountType;

public class BankTransactions {

	static int bankBalanceAmount = 0;

	void deposit(AccountType accountType, int depositAmount) throws BankTransactionException {

		switch (accountType) {
		case SAVINGS:
			if (depositAmount <= 200000)
				bankBalanceAmount = bankBalanceAmount + depositAmount;
			else
				throw new BankTransactionException("Deposit more than 200000 not allowed for Savings account");
			break;

		case CURRENT:
			if (depositAmount <= 1000000)
				bankBalanceAmount = bankBalanceAmount + depositAmount;
			else
				throw new BankTransactionException("Deposit more than 1000000 not allowed for Current account");
			break;
		case RETAIL:
			if (depositAmount <= 2000000)
				bankBalanceAmount = bankBalanceAmount + depositAmount;
			else
				throw new BankTransactionException("Deposit more than 2000000 not allowed for Retail account");
			break;
		default:
			break;
		}

	}

	void withdrawl(AccountType accountTye, int withdrawlAmount, long pin) throws BankTransactionException {

		switch (accountTye) {
		case SAVINGS:
			if (withdrawlAmount <= bankBalanceAmount)
				if (withdrawlAmount <= 50000)
					if (pin == 1123)
						bankBalanceAmount = bankBalanceAmount - withdrawlAmount;
					else
						throw new BankTransactionException("Savings Account Invalid Pin.. Termnating the process");
				else
					throw new BankTransactionException(
							"Transaction Declined..., Withdrawl limit for savings account 50000");
			else
				throw new BankTransactionException("Insufficent Balance");
			break;

		case CURRENT:
			if (withdrawlAmount <= bankBalanceAmount)
				if (withdrawlAmount <= 200000)
					if (pin == 1123)
						bankBalanceAmount = bankBalanceAmount - withdrawlAmount;
					else
						throw new BankTransactionException("Current Account Invalid Pin.. Termnating the process");
				else
					throw new BankTransactionException(
							"Transaction Declined..., Withdrawl limit for current account 200000");
			else
				throw new BankTransactionException("Insufficent Balance");
			break;

		case RETAIL:
			if (withdrawlAmount <= bankBalanceAmount)
				if (withdrawlAmount <= 500000)
					if (pin == 1123)
						bankBalanceAmount = bankBalanceAmount - withdrawlAmount;
					else
						throw new BankTransactionException("Retail Account  Invalid Pin.. Termnating the process");
				else
					throw new BankTransactionException(
							"Transaction Declined..., Withdrawl limit for retail account 500000");
			else
				throw new BankTransactionException("Insufficent Balance");
			break;

		default:
			break;
		}

	}

	void displayBalance() {
		System.out.println(bankBalanceAmount);
	}

}
