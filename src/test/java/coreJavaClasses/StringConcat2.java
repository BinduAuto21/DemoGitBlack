package coreJavaClasses;

public class StringConcat2 {

	public static void main(String[] args) {
		//System.out.println();
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b);   //300
		System.out.println(x+y);   //HelloWorld
		
		System.out.println(a+b+x+y); //300HelloWorld
		
		System.out.println(x+y+a+b); //HelloWorld100200
		
		System.out.println(x+y+(a+b));//HelloWorld300
		
		System.out.println(a+b+x+y+a+x+b+y);//300HelloWorld100Hello200World
		
		System.out.println(a+b+x+y+a+b);//300HelloWorld100200
		
		System.out.println(c+d);//22.66
		
		System.out.println(x+y+c+d);//HelloWorld12.3310.33
		
		System.out.println("helloworld");//helloworld
		
		System.out.println("the value of a is: "+a);//the value of a is: 100
		System.out.println("the value of b is: "+b);//the value of a is: 200
		
		System.out.println("the addition of a and b: "+(a+b));//the addition of a and b: 300
		
		System.out.print("Hello Selenium ");//Hello Selenium Hello Testing
		System.out.println("Hello Testing");
		
		
	}

}
