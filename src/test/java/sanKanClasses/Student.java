package sanKanClasses;

public class Student {
	
	String name;
	int rno;
	Student()
	{
		name = "ABC";
		rno = 123;
	}
	Student(String str, int n){
		name=str;
		rno=n;
	}
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student("DEF",456);
		
		System.out.println(s1.name);   //ABC
		System.out.println(s1.rno);    //123
		
		System.out.println(s2.name);   //DEF
		System.out.println(s2.rno);     //456
		

	}

}
