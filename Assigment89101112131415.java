package set;

import java.util.TreeSet;

public class Assigment89101112131415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts =new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(8);
		ts.add(9);
		int key=5;
//		System.out.println(ts);
//		int first=ts.pollFirst();
//		int last=ts.pollLast();
//		System.out.println(first);
//		System.out.println(last);
//		
//		ts.clone();
//		System.out.println(ts);
//		System.out.println(ts.size());
//		for(int data : ts) {
//			if(data<7) {
//				System.out.println(data);
//			}
			
			System.out.println(ts.ceiling(key));
			System.out.println(ts.floor(key));
		}
		
		

	}


