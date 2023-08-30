package sanKanClasses;

import java.io.PrintStream;
import java.rmi.AccessException;

public class Pr10Variable {
	
	int a =11; //will be a static var if declared as static -so can be directly accessed from main
	static int c = 17;

	public static void main(String[] args) {
		// Local Var, Instance Var, Static Var
		Pr10Variable pv = new Pr10Variable();
		int b =23;
		System.out.println(b);
		System.out.println(pv.a);
		System.out.println(c);
	}

}
