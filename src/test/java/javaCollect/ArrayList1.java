package javaCollect;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//static Array
		int a[]=new int[3];
		a[0] = 11;
		a[1] = 12;
		a[2] = 13;
		
		System.out.println(a[2]);
		try {
		System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			e.getStackTrace();
			e.getMessage();
			e.hashCode();	
		}
		
		//Dynamic Array - ArrayList
		ArrayList ar1 = new ArrayList();
		ar1.add(14);
		ar1.add(15);
		ar1.add("BinsList");
		
		ArrayList ar2 = new ArrayList();
		ar2.add("Naveen");
		ar2.add("Automation");
		ar2.add("Labs");
		
		ar1.addAll(ar2);
		
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
	}

}
