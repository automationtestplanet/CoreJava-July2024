package oops.inheritance;

public class OfficeStaff extends Faculty {
	
	String officeStaffName;
	
	void displayOfficeStaffDetails(){
//		displayCollegeDetails();
		System.out.println("Office Staff Name: "+ this.officeStaffName);
	}
	
	public static void main(String[] args) {
		OfficeStaff officestaff1 = new OfficeStaff();
		officestaff1.officeStaffName = "Venkat";
		officestaff1.facultyName = "Raj";
		officestaff1.subject = "Automation Testing";
		
		officestaff1.studentName = "Ram";
		officestaff1.rollNo = 1001;
		officestaff1.education = "BTech";
		
		officestaff1.displayCollegeDetails();
		officestaff1.displayStudentDetails();		
		officestaff1.displayFacultyDetails();
		
		officestaff1.displayOfficeStaffDetails();
//		officestaff1.displayAdminDetails();
		
	}

}
