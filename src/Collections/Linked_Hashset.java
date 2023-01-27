package Collections;

import java.util.LinkedHashSet;

public class Linked_Hashset {
	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("abc");
		lh.add(600);
		lh.add(null);
		lh.add('G');
		lh.add(null);
		lh.add(600);
		System.out.println(lh);
		//is empty
		System.out.println(lh.isEmpty());
		//contains
		System.out.println(lh.contains(null));
		//size
		System.out.println(lh.size());
		
	}
	

}
