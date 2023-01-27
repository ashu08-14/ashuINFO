package String_Class;

public class String_method03 {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="ASHWINI";
		String s3="city";
		//length
		System.out.println(s3.length());
		//toUpperCase
		System.out.println(s1.toUpperCase());
		//toLowerCase
		System.out.println(s2.toLowerCase());
		//equal
		System.out.println(s1.equals(s3));
		//equalIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s3));
		//charAt
		System.out.println(s2.charAt(3));
		//indexOf
		System.out.println(s3.indexOf('L'));
		//conCat
		System.out.println(s1.concat(s2));
		//subString
		System.out.println(s1.substring(4));
		//startWith
		System.out.println(s3.startsWith("AS"));
		//endWith
		System.out.println(s1.endsWith("ty"));
		//contains
		System.out.println(s2.contains(s3));
	}

}
