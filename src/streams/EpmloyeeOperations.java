package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EpmloyeeOperations {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Ram", 1003, 80000));
		empList.add(new Employee("Krish", 1004, 95000));
		empList.add(new Employee("Shiv", 1001, 75000));
		empList.add(new Employee("Kamal", 1002, 65000));
		
		List<Employee> filteredEmp = empList.stream().filter(eachEmp -> eachEmp.getEmpSal() < 80000).collect(Collectors.toList());
		System.out.println(filteredEmp.size());
		filteredEmp.forEach(eachEmp-> System.out.println(eachEmp.getEmpName()));
		
		empList.stream().filter(eachEmp -> eachEmp.getEmpName().startsWith("K")).forEach(emp-> System.out.println(emp.getEmpName()));
		
		
		empList.forEach(eachEmp -> System.out.println(eachEmp.getEmpId()));
		
		System.out.println("--------------------------Comparator Interface---------------------");
		
		Comparator<Employee> empComp = new Comparator<Employee>() {			
			@Override
			public int compare(Employee emp1, Employee emp2) {
				 if(emp1.getEmpId() > emp2.getEmpId())
					 return 0;
				 else
					 return -1;
			}
		};
		
		Comparator<Employee> empComp2 = ((e1,e2) -> {if(e1.getEmpId() < e2.getEmpId()) return 0;else return -1;} );
		
		System.out.println("-----------------------------------------------");
		Collections.sort(empList,empComp2);
		empList.forEach(eachEmp -> System.out.println(eachEmp.getEmpId()));
		
		Comparator<Employee> empComp3 = ((e1,e2) -> {if(e1.getEmpSal() < e2.getEmpSal()) return 0;else return -1;} );
		
		System.out.println("--------------------------Comparable Interface---------------------");
		Collections.sort(empList,empComp3);
		empList.forEach(eachEmp -> System.out.println(eachEmp.getEmpName() +" "+ eachEmp.getEmpSal()));
		
		
		System.out.println("-------------------------------------------------------");
		
		List<Employee2> empList2 = new ArrayList<>();
		empList2.add(new Employee2("Ram", 1003, 80000));
		empList2.add(new Employee2("Krish", 1004, 95000));
		empList2.add(new Employee2("Shiv", 1001, 75000));
		empList2.add(new Employee2("Kamal", 1002, 65000));
		
		Collections.sort(empList2);
		
		empList2.forEach(eachEmp -> System.out.println(eachEmp.getEmpName() +" "+ eachEmp.getEmpSal()));
		
	}

}
