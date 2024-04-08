package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class setAssigments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(23);
		set.add(34);
		set.add(45);
		set.add(56);
		set.add(67);

		// remaining
		TreeSet<Integer> ts = new TreeSet<Integer>(set);
		System.out.println(ts);

		Object[] array = set.toArray();
		System.out.println(Arrays.toString(array));

//	System.out.println(set.clone());
//	System.out.println(set.isEmpty());
//	System.out.print(set.size());
		HashSet<Integer> clone = (HashSet<Integer>) set.clone();
		System.out.println(clone);

		// is empty
		boolean empty = set.isEmpty();
		System.out.println(empty);

	}

}
