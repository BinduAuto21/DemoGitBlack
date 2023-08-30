package sanKanClasses;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		String newStr = str.concat("World");
		System.out.println(newStr);
		System.out.println(str.indexOf("H"));
		System.out.println("Character at= "+newStr.charAt(4));
		System.out.println(newStr.toUpperCase());
		System.out.println(newStr);
		System.out.println(newStr.toLowerCase());
		System.out.println(newStr.compareToIgnoreCase("hello"));
		System.out.println(newStr.trim());
		
		

	}

}
