package oopsPkg;

public class EmployeeData {
	//1.private data variables:so that these vars cannot be accessed directly from outside the class
	private int ssn;
	private String empName;
	private int empAge;
	

	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData();
		emp.setEmpName("bkarnam");
		emp.setEmpAge(50);
		emp.setSsn(12345);
		
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpAge());
		System.out.println(emp.getSsn());
		
	}

    //2.getter and setter methods:to set and get the values of the fields
	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
