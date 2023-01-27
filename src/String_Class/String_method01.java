package String_Class;

public class String_method01 {
	public static void main(String[] args) {
		String a1="ashrika";
		String a2="NASHIKCITY";
		String a3="CITY";
		//length()
		System.out.println(a1.length());
		//toUpperCase
		System.out.println(a1.toUpperCase());
		//tolowerCase()
		System.out.println(a2.toLowerCase());
		//equals()
		System.out.println(a2.equals(a3));
		//equalIgnoreCase()
		System.out.println(a1.equalsIgnoreCase(a2));
		//contains()
		System.out.println(a1.contains(a3));
		System.out.println(a2.contains(a3));
		//charAt
		System.out.println(a1.charAt(4));
		//indexOf()
		System.out.println(a3.indexOf('I'));
	    //conCat()
		System.out.println(a1.concat(a3));
		//subString()
		System.out.println(a2.substring(2));
		//startsWith()
		System.out.println(a3.startsWith("as"));
		//endsWith()
		System.out.println(a2.endsWith("TY"));
}

}
