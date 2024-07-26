package streams;

public class Employee {	
	private String empName;
	private long empId;
	private int empSal;
	
	Employee(String empName, long empId, int empSal){
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
	}

	public String getEmpName() {
		return empName;
	}

	public long getEmpId() {
		return empId;
	}

	public int getEmpSal() {
		return empSal;
	}
	
	

}
