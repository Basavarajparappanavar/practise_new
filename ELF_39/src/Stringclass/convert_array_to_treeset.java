package Stringclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class convert_array_to_treeset {
public static void main(String[] args) {
	String a[]= {"raaju","hi"};
	HashMap<Integer, String> hp=new HashMap<>();
	for(int i=0;i<a.length;i++) {
		hp.put(i, a[i]);
	}
	System.out.println(hp);
	
}
}
