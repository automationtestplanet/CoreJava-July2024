package fundamentals;

public class StringFunctions {

	public static void main(String[] args) {
		
		String str1 = "Hello Java";
		
		String newStr = str1.toUpperCase();
		System.out.println(newStr);		
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.length());
		
		String[] allWords = str1.split(" ");
		for(String eachStr:allWords) {
			System.out.println(eachStr);
		}		
		
		char[] allChars = str1.toCharArray();
		for(char eachChar:allChars) {
			System.out.println(eachChar);
		}
		
		System.out.println(str1.charAt(0));
		
		System.out.println(str1.charAt(str1.length()-1));
		
		System.out.println(str1.indexOf("H"));
		System.out.println(str1.indexOf("l"));
		System.out.println(str1.lastIndexOf("l"));
		System.out.println(str1.indexOf("l",3));
		
		System.out.println(str1.contains("H"));
		System.out.println(str1.contains("Hello"));
		System.out.println(str1.contains("llo"));
		System.out.println(str1.contains("olo"));
		
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(6,8));
		
		System.out.println(str1.replace("l", "2"));
		System.out.println(str1.replaceFirst("l", "2"));
		
		String str2 = "asdfgfHODHFYQRROlkjhj82648*^$*^@*%";
		System.out.println(str2.replaceAll("[^a-z]", ""));
		System.out.println(str2.replaceAll("[^A-Z]", ""));
		System.out.println(str2.replaceAll("[^0-9]", ""));		
		System.out.println(str2.replaceAll("[^a-zA-Z]", ""));
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str2.replaceAll("[a-zA-Z0-9]", ""));
		
		
		String string1 = "Hello";
		String string2 = new String("Hello");
		String string3 = "hello";
		
		System.out.println(string1);
		System.out.println(string2);
		
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));
		System.out.println(string1.equals(string3));
		System.out.println(string1.equalsIgnoreCase(string3));		
		System.out.println(string1.concat("World"));		
		
	}

}
