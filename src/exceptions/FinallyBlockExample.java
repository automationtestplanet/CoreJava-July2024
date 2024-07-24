package exceptions;

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------");
		try {			
			System.out.println("Open Database");			
			System.out.println("Fecting column data from database");				
			String str = "Data";
			System.out.println(str.toUpperCase());
			
			System.out.println("Close Database");
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("-----------------------------------------");
		try {			
			System.out.println("Open Database");			
			System.out.println("Fecting column data from database");				
			String str = null;
			System.out.println(str.toUpperCase()); // error			
			System.out.println("Close Database");
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("-----------------------------------------");
		try {			
			System.out.println("Open Database");			
			System.out.println("Fecting column data from database");				
			String str = null;
			System.out.println(str.toUpperCase()); // error	
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Close Database");
		}
		
		System.out.println("-----------------------------------------");
		try {			
			System.out.println("Open Database");			
			System.out.println("Fecting column data from database");				
			String str = "Hello";
			System.out.println(str.toUpperCase()); // error	
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Close Database");
		}
		
		System.out.println("-----------------------------------------");
		try {			
			System.out.println("Open Database");			
			System.out.println("Fecting column data from database");				
			String str = null;
			System.out.println(str.toUpperCase()); // error	
		
		}catch(Exception e) {
			System.out.println(e.getMessage());			
		}finally {
			System.out.println("Close Database");
		}
		
		System.out.println("-----------------------------------------");
		try {			
			System.out.println("Open Database");			
			System.out.println("Fecting column data from database");				
			String str = "Java";
			System.out.println(str.toUpperCase()); // error	
		
		}catch(Exception e) {
			System.out.println(e.getMessage());			
		}finally {
			System.out.println("Close Database");
		}

	}

}
