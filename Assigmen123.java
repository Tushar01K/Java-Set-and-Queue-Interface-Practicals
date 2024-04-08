package set;

import java.util.HashMap;
import java.util.HashSet;

public class Assigmen123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(80);
		set.add(23);
		set.add(34);
		set.add(45);
		set.add(56);
		set.add(67);
		set.add(78);

//check two hasset and retain same value
		HashSet<Integer> set2 = new HashSet<Integer>();
		set.retainAll(set);
		System.out.println(set);
	

		for (int data : set) {
			if (set2.contains(data) == true) {
				System.out.println(data);
			}

		}
	}
}
