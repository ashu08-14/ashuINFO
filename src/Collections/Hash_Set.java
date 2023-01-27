package Collections;

import java.util.HashSet;

public class Hash_Set {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("Nashik");
		h.add(null);
		h.add('N');
		h.add(300);
		h.add("Nashik");
		h.add(null);
		System.out.println(h);
		//is empty
		System.out.println(h.isEmpty());
		// contains
		System.out.println(h.contains('N'));
		//size
		System.out.println(h.size());
	
		
	}

}
