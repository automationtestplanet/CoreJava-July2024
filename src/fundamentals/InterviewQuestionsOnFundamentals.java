package fundamentals;

public class InterviewQuestionsOnFundamentals {

	public static void swapNumbers(int a, int b) {
//		swap a and b values without third variable
		System.out.println("-----------------Before Swap------------------");
		System.out.println("A value is: " + a);
		System.out.println("B value is: " + b);
		System.out.println("-----------------After Swap------------------");
//		int c = a;		
//		a = b;		
//		b = c;
		a = a + b; // 300
		b = a - b; // 300 - 200 = 100
		a = a - b; // 300 - 100 = 200
		System.out.println("A value is: " + a);
		System.out.println("B value is: " + b);
	}
	
	public static void checkPrime(int num) {
		// check whether the given number is prime or not
		int count  = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i ==0)
					count++;
		}		
		if(count == 2)
			System.out.println(num + " is prime number");
		else
			System.out.println(num + " is not prime number");		
	}
	
	public static void stringReverse(String str) {
		System.out.println("Before Reverse: "+ str);		
		String revStr = "";		
		for(char eachChar: str.toCharArray())
			revStr = eachChar + revStr;
		System.out.println("After Reverse: "+ revStr);
	}
	
	public static void numberReverse(int num) {
		int tempNum = num;
		int revNum = 0;
		while(tempNum > 0) {			
			int remainder = tempNum % 10; // 3 4 1
			revNum = remainder + (revNum * 10);		// 3	34   341
			tempNum = tempNum / 10;			// 14  1  0
		}		
		System.out.println(revNum);
	}
	
	public static void numberReverse2(int num) {
		String revNum = "";
		for(char eachNum : String.valueOf(num).toCharArray()) {
			revNum = eachNum + revNum;
		}		
		System.out.println(Integer.parseInt(revNum));
	}
	
	public static void checkStringPallendrome(String str) {
		String revStr = "";		
		for(char eachChar: str.toCharArray())
			revStr = eachChar + revStr;		
		if(str.equals(revStr))
			System.out.println(str+ " is a pallendrome");
		else
			System.out.println(str+ " is not a pallendrome");
	}
	
	public static void checkNumberPallendrome(int num) {
		String revNum = "";
		for(char eachNum : String.valueOf(num).toCharArray()) {
			revNum = eachNum + revNum;
		}		
		if(Integer.parseInt(revNum) == num)
			System.out.println(num+ " is a pallendrome");
		else
			System.out.println(num+ " is not a pallendrome");
	}
	
	public static void checkArmstrongNumber(int num) {
		// 153 is a Armstrong number -> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153		
		int sum = 0;
		int tempNum = num;
		while(tempNum > 0) {			
			int remainder = tempNum % 10;
			sum = sum + (remainder * remainder * remainder);
			tempNum = tempNum / 10;	
		}		
		if(sum == num)
			System.out.println(num+ " is a Armstrong number");
		else
			System.out.println(num+ " is not a Armstrong number");
	}
	
	public static void reverseEachWordWithutChangingPosition(String str) {
		// String str = "Hello this is Java"
		// o/p: olleH siht si avaJ		
		String revStr = "";
		for(String eahcWord: str.split(" ")) {
			String eachWordRevStr = "";
			for(char eachChar : eahcWord.toCharArray()) {
				eachWordRevStr = eachChar + eachWordRevStr;
			}			
			revStr = revStr + eachWordRevStr + " ";			
		}		
		System.out.println(revStr.trim());		
	}
	
	public static void sumOnlyNumbersFromString(String str) {
		// String str = "AKHda472562*($*$"
		// sum = 4 + 7 + 2 + 5 + 6 + 2 = 26;  
		// 52 + 55 + 50 + 53 + 54 + 50 = 314
		// (52 - 48) + (55 - 48) + (50 - 48) + (53 - 48) + (54 - 48) + (50 - 48) = 26 		
		int sum = 0;
		for(char eachNum : str.replaceAll("[^0-9]", "").toCharArray()) {
			sum +=  (eachNum-'0');
		}		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		swapNumbers(100, 200);
		checkPrime(13);		
		stringReverse("World");
		numberReverse(143);
		numberReverse2(143);
		checkStringPallendrome("AbccbA");
		checkStringPallendrome("Hello");
		checkNumberPallendrome(141);
		checkNumberPallendrome(143);		
		checkArmstrongNumber(143);
		checkArmstrongNumber(153);
		reverseEachWordWithutChangingPosition("Hello this is Java");
		sumOnlyNumbersFromString("AKHda472562*($*$");
	}
}
