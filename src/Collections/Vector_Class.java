package Collections;

import java.util.Vector;

public class Vector_Class {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("India");
		v.add(100);
		v.add(null);
		v.add('Z');
		v.add("hello");
		v.add(300);
		v.add(null);
		//check the capacity
		System.out.println(v.capacity());
		//check the size
		System.out.println(v.size());
		//print entire data
		System.out.println(v);
		//isEmpty
		System.out.println(v.isEmpty());
		//get the particular data
		System.out.println(v.get(3));
		//right shift
	    v.add(3,"Bharat");
		System.out.println(v);
		//remove(left shift)
		v.remove(3);
		System.out.println(v);
		//contains
		System.out.println(v.contains(300));
	}

}
