package Collections;

import java.util.ArrayList;

public class Array_List4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("hello");
		al.add(300);
		al.add(null);
		al.add(null);
		al.add('s');
		al.add("hello");
		al.add(487);
		System.out.println(al);
		//size
		System.out.println(al.size());
		//isEmpty
		System.out.println(al.isEmpty());
		//contains
		System.out.println(al.add('S'));
		//insertion
		al.add(2,"full");
		System.out.println(al);
		//remove
		al.remove(2);
		System.out.println(al);
		//get data
		System.out.println(al.get(6));
		
	}

}
