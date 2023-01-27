package Collections;

import java.util.LinkedList;

public class Linked_List {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("ASHRIKA");
		l.add(null);
		l.add('B');
		l.add(100);
		l.add(null);
		l.add(100);
		//print all data 
		System.out.println(l);
		//check size
		System.out.println(l.size());
		//contains
		System.out.println(l.contains(100));
		//get the data
		System.out.println(l.get(2));
		//insertion
		l.add(1,"KIRKTE");
		System.out.println(l);
		//remove
		l.remove(1);
		System.out.println(l);
		//isEmpty
		System.out.println(l.isEmpty());
		
	
		
}
}