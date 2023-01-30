package Stringclass;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class swaping_keys_values {
public static void main(String[] args) {
	HashMap<String , Integer> map=new HashMap<>();
	map.put("hi", 1);
	map.put("hello", 2);
	HashMap<Integer, String> map2=new HashMap<>();
		for(String s:map.keySet()) {
			map2.put(map.get(s), s);
		}
		System.out.println(map2.keySet());
}
}
