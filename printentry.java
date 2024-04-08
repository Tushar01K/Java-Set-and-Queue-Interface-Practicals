package set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

public class printentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		Set<Entry<Integer, Integer>> entryset = map.entrySet();

		System.out.println(entryset);
		
		//mapto treemap

		TreeMap<Integer, Integer> map2 = new TreeMap<>(map);
		System.out.println(map2);
		
		
		//containskey
		boolean containkey = map.containsKey(3);
				System.out.println(containkey);
				
				
			Set<Integer> set = map.keySet();
					System.out.println(set);
	}
}
