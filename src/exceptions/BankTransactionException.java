package exceptions;

public class BankTransactionException extends Exception {
	
	public BankTransactionException(String errorMessage) {
		System.out.println(errorMessage);
	}
	
	@Override
	public String toString() {
		return "Invald pin";
	}

}
