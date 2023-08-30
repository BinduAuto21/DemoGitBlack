package sanKanClasses;

import java.util.Scanner;

public class PrScanner {

	public static void main(String[] args) {
		String name;
		int a;
		float b;
		
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		a = sc.nextInt();
		b = sc.nextFloat();
		
		System.out.println(name);
		System.out.println(a);
		System.out.println(b);

	}

}
