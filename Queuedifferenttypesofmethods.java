package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class differenttypesofmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(34);
		q.add(78);
		q.add(79);
		q.add(80);
		q.add(57);

		System.out.println(q.element());
		for (int data : q) {
			System.out.println(data);
		}
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		q1.addAll(q);
		System.out.println(q);

		// insert given element in to priority queue

		q.add(89);
		System.out.println(q);

		// remove all
		//q.clear();
		//System.out.println(q);

		// count the number of priority queue
		System.out.println(q1.size());
		
		//compare two priority queue
		
//		LinkedList<Integer> map = new LinkedList<Integer>();
//		for(int data : q) {
//			map.addAll(q1.contains(data)?"yes":"NO");
//			
//		}
		
		
		q.element();
		System.out.println(q);
		
		Object [] a= q.toArray();
		System.out.println(Arrays.toString(a));
	}

}
