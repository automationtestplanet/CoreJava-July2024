package fundamentals;

public class ChainingOfMethods {
	String firstName;
	String lastName;	
	String fullName;
	
	public String getFirstName(String firstName) {
		return firstName;
	}
	
	public String getLastName(String lastName) {
		return lastName;
	}
	
	public ChainingOfMethods setFirstName(String firstName) {
		this.firstName = firstName;		
		return this;
	}
	
	public ChainingOfMethods setlastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public ChainingOfMethods setFullName() {
		this.fullName = this.firstName+ " "+this.lastName;
		return this;
	}
	
	public void displayFullName() {
		System.out.println("FullName: "+ this.fullName);
	}
	
	

	public static void main(String[] args) {
		ChainingOfMethods chnMethods = new ChainingOfMethods();
		
		chnMethods.setFirstName(chnMethods.getFirstName("Mahesh")).setlastName(chnMethods.getLastName("Babu")).setFullName().displayFullName();

	}

}
