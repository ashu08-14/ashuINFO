package Collections;

import java.util.ArrayList;


public class Array_List {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Ashwini");
		al.add(100);
		al.add('A');
		al.add(null);
		al.add(null);
		al.add("Ashwini");
		al.add(null);
		al.add("Ashrika");
		al.add(100);
		al.add(null);
		al.add(100);
		al.add('G');
	
		// I need to print entire data inside the collection
		System.out.println(al);
		// check size
		System.out.println(al.size());
		//check whether it id empty
		System.out.println(al.isEmpty());
		//contains or not
		System.out.println(al.contains(100));
		//get the data of particular index
		System.out.println(al.get(0));
		//insertion (right shift operator)
		al.add(2,500);
		System.out.println(al.get(2));
		//print entire data
		System.out.println(al);//right shift operation
		//remove the data (left shift operation)
		al.remove(2);// left shift
		System.out.println(al);
	
		
		
		
		
		
	}

}
