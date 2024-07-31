package exceptions;

public class UseUserDefinedExcepion {

	static void add(int ...a) throws UserDefinedException{
		int sum = 0;	
		if(a.length == 1) {
//			try {
//				throw new UserDefinedException();
//			}catch(UserDefinedException ude) {
//				System.out.println(ude.getMessage());
//			}
			throw new UserDefinedException();
		}else {
			for(int eachVal:a)
				sum+=eachVal;
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) throws UserDefinedException{
		
		try {
		add(10);
		}catch(Exception e) {
//			add(10,20);
			e.printStackTrace();
		}
	}

}
