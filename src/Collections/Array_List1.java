package Collections;

import java.util.ArrayList;

public class Array_List1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("ASHRIKA");
		al.add(null);
		al.add(100);
		al.add("GAURAV");
		al.add(null);
		al.add(null);
		al.add(100);
		al.add('B');
		System.out.println(al);
		//size
		System.out.println(al.size());
		//isEmpty
		System.out.println(al.isEmpty());
		//contains
		System.out.println(al.contains("GAURAV"));
		//INERTION 
		al.add(3, "KIRKTE");
		System.out.println(al);
		//remove(left shift)
		al.remove(3);
		System.out.println(al);
		//get the data
		System.out.println(al.get(0));
	
		
		
		
	}

}
