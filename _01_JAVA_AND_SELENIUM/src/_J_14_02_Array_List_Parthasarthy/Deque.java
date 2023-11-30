package _J_14_02_Array_List_Parthasarthy;

import java.util.ArrayDeque;
//import java.util.ArrayList;
import java.util.Iterator;

public class Deque {

	public static void main(String[] args) {
		Deque <String> d = new ArrayDeque<String>();
		d.add("abc");
		d.add("bcd");
		d.add("def");
		d.add("hg");
		d.add("ikj");
		
		Iterator itr = d.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
