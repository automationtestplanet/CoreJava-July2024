package streams;

public class Employee2 implements Comparable<Employee2>{	
	private String empName;
	private long empId;
	private int empSal;
	
	Employee2(String empName, long empId, int empSal){
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

	@Override
	public int compareTo(Employee2 e1) {
		if( e1.getEmpId() < this.getEmpId())
			 return 0;
		 else
			 return -1;
	}

}
