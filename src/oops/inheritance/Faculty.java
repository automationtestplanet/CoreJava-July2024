package oops.inheritance;

public class Faculty extends Student {

	String facultyName;
	String subject;
	
	void displayFacultyDetails(){
//		displayCollegeDetails();
		System.out.println("Faculty Name: "+this.facultyName);
		System.out.println("Faculty teaches Subject : "+this.subject);
	}
	
	public static void main(String[] args) {
		Faculty faculty1 = new Faculty();
		faculty1.facultyName = "Raj";
		faculty1.subject = "Automation Testing";
		
		faculty1.studentName = "Ram";
		faculty1.rollNo = 1001;
		faculty1.education = "BTech";
		
		faculty1.displayCollegeDetails();
		faculty1.displayStudentDetails();		
		faculty1.displayFacultyDetails();
//		
//		faculty1.displayOfficeStaffDetails();
//		faculty1.displayAdminDetails();
	}
}
