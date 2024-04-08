package set;

import java.util.HashSet;

public class uniqueeleandpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {1,2,1};
		HashSet<Integer> hs=new HashSet<Integer>();
		
		//unique element;
		 for(int data :a) {
			 hs.add(data);
		 }
		 System.out.println(hs);
		 
		 //uniquepair
		 
		 for(int data1:hs) {
			 for(int data2:hs) {
				 System.out.println(data1+" "+data2);
			 }
		 }
	}

}
