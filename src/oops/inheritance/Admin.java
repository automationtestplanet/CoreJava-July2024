package oops.inheritance;

public class Admin extends Faculty {
	String admingName;
	
	void displayAdminDetails() {
//		displayCollegeDetails();
		System.out.println("Admn Name: "+this.admingName);
	}
	
	public static void main(String[] args) {
		Admin admin1 = new Admin();
		admin1.admingName = "Prathap";
		admin1.facultyName = "Raj";
		admin1.subject = "Automation Testing";
		
		admin1.studentName = "Ram";
		admin1.rollNo = 1001;
		admin1.education = "BTech";
		
		admin1.displayCollegeDetails();
		admin1.displayStudentDetails();		
		admin1.displayFacultyDetails();
		admin1.displayAdminDetails();
		
//		admin1.displayOfficeStaffDetails();
		
				
	}
}
