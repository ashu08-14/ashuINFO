package String_Class;

public class String_method04 {
public static void main(String[] args) {
	String s1="wild animals";
	String s2="FOREST";
	String s3="aniaml";
	//length
	System.out.println(s1.length());
	//toUpperCase
	System.out.println(s3.toUpperCase());
	//toLowerCase
	System.out.println(s2.toLowerCase());
	//equals
	System.out.println(s1.equals(s3));
	//equalsIgnoreCase
	System.out.println(s2.equalsIgnoreCase(s1));
	//contains
	System.out.println(s1.contains(s3));
	//conCat
	System.out.println(s1.concat(s2));
	//charAt
	System.out.println(s2.charAt(5));
	//indexOf
	System.out.println(s3.indexOf('l'));
	//subString
	System.out.println(s1.substring(5));
	//startsWith
	System.out.println(s3.startsWith("an"));
	//endsWith
	System.out.println(s2.endsWith("ls"));
}
}
