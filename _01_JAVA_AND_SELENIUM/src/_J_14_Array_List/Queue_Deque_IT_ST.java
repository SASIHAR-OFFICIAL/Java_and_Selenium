package _J_14_Array_List;

import java.util.ArrayDeque;
//import java.util.ArrayList;
import java.util.Iterator;

public class Queue_Deque {

	public static void main(String[] args) {
		Queue_Deque <String> d = new Queue_Deque <String> ();
		//Queue_Deque <String> d = new ArrayQueue_Deque<String>();
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
