package String_Class;

public class String_method02 {
	public static void main(String[] args) {
		String c1="GAURAV";
		String c2="boschnashik";
		String c3="nashik";
		//length
		System.out.println(c2.length());
		//toUpperCase()
		System.out.println(c3.toUpperCase());
		//toLowerCase()
		System.out.println(c1.toLowerCase());
		//equals()
		System.out.println(c2.equals(c3));
		//equalsIgnoreCase()
		System.out.println(c1.equalsIgnoreCase(c3));
		//contains
		System.out.println(c2.contains(c3));
		//charAt
		System.out.println(c2.charAt(5));
		//indexOf
		System.out.println(c1.indexOf('V'));
		//conCat
		System.out.println(c1.concat(c3));
		//substring
		System.out.println(c2.substring(3));
		//startsWith
		System.out.println(c1.startsWith("GA"));
		//endsWith
		System.out.println(c2.endsWith("ik"));
	}

}
