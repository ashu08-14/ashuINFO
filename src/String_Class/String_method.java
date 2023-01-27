package String_Class;

public class String_method {
	public static void main(String[] args) {
	String s1="velocity";
	String s2="ASHWINI";
	String s3="city";
	//length()
	System.out.println(s1.length());
	//toUpperCase()
	System.out.println(s1.toUpperCase());
	//toLowerCase
	System.out.println(s2.toLowerCase());
	//equals()
	System.out.println(s1.equals(s2));
	//equalEgnoreCase
	System.out.println(s1.equalsIgnoreCase(s2));
	//contains()
	System.out.println(s1.contains(s3));
	System.out.println(s1.contains(s2));
	//charAt
	System.out.println(s1.charAt(5));
	//indexOf()
	System.out.println(s2.indexOf('H'));
	//conCat()
	System.out.println(s1.concat(s2));
	//substring()
	System.out.println(s3.substring(1));
	//startsWith()
	System.out.println(s1.startsWith("ve"));
	//endsWith()
	System.out.println(s2.endsWith("NI"));
}

}
