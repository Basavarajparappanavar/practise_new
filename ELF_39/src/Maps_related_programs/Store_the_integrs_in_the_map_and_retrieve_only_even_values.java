package Maps_related_programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Store_the_integrs_in_the_map_and_retrieve_only_even_values {
public static void main(String[] args) {
	HashMap<Integer, Integer>map=new HashMap<>();
	map.put(1, 1);
	map.put(1, 2);
	map.put(2, 4);
	map.put(3, 4);
	//Set<Entry<Integer,Integer>> s=map.entrySet();
	int k=1;
//	for(Entry<Integer,Integer>l:s) {
//		if(l.getValue()%2==0) {
//		System.out.println(k+++":"+l.getValue());
//	}
//	}
	Collection<Integer> s=map.values();
	for(Integer l:s) {
		if(l%2==0) {
			System.out.println(k+++"-"+l);
		}
	}
}
}
