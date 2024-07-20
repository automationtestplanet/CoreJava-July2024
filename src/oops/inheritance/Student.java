package oops.inheritance;

public class Student extends College {
	
	String studentName;
	int rollNo;
	String education;
	
//	Student(String studentName, int rollNo, String education){
//		this.studentName = studentName;
//		this.rollNo  = rollNo;
//		this.education = education;
//	}
	
	void displayStudentDetails() {
//		displayCollegeDetails();
		System.out.println("Student Name: "+ this.studentName);
		System.out.println("Student Roll No: "+ this.rollNo);
		System.out.println("Student Education: "+ this.education);
	}
	
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "Ram";
		student1.rollNo = 1001;
		student1.education = "BTech";  
		
		student1.displayCollegeDetails();
		student1.displayStudentDetails();
		
//		student1.displayFacultyDetails();
//		student1.displayOfficeStaffDetails();
//		student1.displayAdminDetails();
	}

}
