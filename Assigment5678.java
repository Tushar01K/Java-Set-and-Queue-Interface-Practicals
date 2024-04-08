package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Assigment5678 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(7);

		// reverse ts
		ArrayList<Integer> al = new ArrayList<Integer>(ts);
		Collections.reverse(al);
		System.out.println(al);

		Iterator<Integer> it = ts.descendingIterator();
		while (it.hasNext() == true) {
			System.out.println(it.next());
		}

		TreeSet<Integer> ts1 = new TreeSet<Integer>(ts);
		System.out.println(ts1);
		ts1.add(100);

		ts1.addAll(ts);
		System.out.println(ts1);
		
			
	}
}
