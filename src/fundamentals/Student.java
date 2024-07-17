package fundamentals;

public class Student {
	String sName;
	int sRollNo;
	static String qualification = "11th";

	void display() {
		System.out.println(sName);
		System.out.println(sRollNo);
		System.out.println(qualification);
	}
	
//	static void display2() {
//		System.out.println(sName);
//		System.out.println(sRollNo);
//		System.out.println(qualification);
//	}

	public static void main(String[] args) {
		Student student1 = new Student();		// local
		student1.sName = "Ram";
		student1.sRollNo = 1001;
				
		System.out.println("-------------Student1---------------");
		student1.display();

		Student student2 = new Student();
		student2.sName = "Raj";
		student2.sRollNo = 1002;
		
		System.out.println("-------------Student2---------------");
		student2.display();

		Student student3 = new Student();
		student3.sName = "Kishore";
		student3.sRollNo = 1003;
		
		System.out.println("-------------Student3---------------");
		student3.display();

		Student student4 = new Student();
		student4.sName = "Ganesh";
		student4.sRollNo = 1004;
		
		System.out.println("-------------Student4---------------");
		student4.display();

	}

}
