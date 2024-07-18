package oops.inheritance;

public class College {
	
	static final String COLLEGE_NAME = "BVK College";
	static final String UNIVERSITY = "Andhra University";
	String location = "Visakhapatnam";
	
	void displayCollegeDetails() {
		System.out.println("College Name: "+ College.COLLEGE_NAME);
		System.out.println("College University: "+ College.UNIVERSITY);
		System.out.println("College Location: "+ this.location);
	}
	
	public static void main(String[] args) {
		College college = new College();
		college.displayCollegeDetails();

//		college.displayStudentDetails();
//		college.displayFacultyDetails();
//		college.displayOfficeStaffDetails();
//		college.displayAdminDetails();
		
	}

}
