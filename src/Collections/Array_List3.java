package Collections;

import java.util.ArrayList;

public class Array_List3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(null);
		al.add("JAVA PROGRAM");
		al.add(2000);
		al.add(null);
		al.add("Ashwini");
		al.add(null);
		al.add('B');
		al.add(null);
		al.add(2000);
		System.out.println(al);
		//size
		System.out.println(al.size());
		//contains
		System.out.println(al.contains(2000));
		//get data
		System.out.println(al.get(1));
		//insertion
		al.add(2, "savi");
		System.out.println(al);
		//remove
		al.remove(2);
		System.out.println(al);
		//isEmpty
		System.out.println(al.isEmpty());
		
	}

}
