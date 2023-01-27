package Collections;

import java.util.ArrayList;

public class Array_List2 {
	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(100);
	al.add("nashik");
	al.add(null);
	al.add('D');
	al.add(null);
	al.add(100);
	System.out.println(al);
	//size
	System.out.println(al.size());
	//insertion
	al.add(2, 'H');
	System.out.println(al);
	//remove
	al.remove(2);
	System.out.println(al);
	//get data
	System.out.println(al.get(3));
	// contains
	System.out.println(al.contains(100));
	//isEmpty
	System.out.println(al.isEmpty());
}

}
