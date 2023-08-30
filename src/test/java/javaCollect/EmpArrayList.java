package javaCollect;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpArrayList {

	public static void main(String[] args) {
		
		ArrayList<Employee> arEmp = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Kiranmayee",49,"SeniorDev");
		Employee e2 = new Employee("EstherSugandi",48,"Dev");
		Employee e3 = new Employee("Renuka",47,"QA");
		
		arEmp.add(e1);
		arEmp.add(e2);
		arEmp.add(e3);
		
		//for loop doesnot work to read the data as the elements not stored on the basis of index
		Iterator<Employee> it = arEmp.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		

	}

}
