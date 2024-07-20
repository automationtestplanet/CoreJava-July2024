package oops.abstraction;

public interface Calculator {


	/**
	 * Description:This method perform addition operation on two numbers and return the result as integer 
	 * @param a
	 * @param b
	 * @return
	 */
	public int addition(int a, int b) ;
	
	/**
	 * Description:This method perform subtraction operation on two numbers and return the result as integer 
	 * @param a
	 * @param b
	 * @return
	 */
	public int susbstraction(int a, int b);

	
	/**
	 * Description:This method perform multiplication operation on two numbers and return the result as integer 
	 * @param a
	 * @param b
	 * @return
	 */
	public int multiplication(int a, int b);
	

	/**
	 * Description:This method perform division operation on two numbers and return the result as integer 
	 * @param a
	 * @param b
	 * @return
	 */
	public int division(int a, int b);
}
