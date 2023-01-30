package Stringclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class to_count_occurance_of_every_character_in_string {
public static void main(String[] args) {
	String s="Apple";
	Map<Character, Integer>map=new HashMap<>();
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(map.containsKey(ch[i])) {
			map.put(ch[i], map.get(ch[i])+1);	
			}
		else {
			map.put(ch[i], 1);
		}
		
	}
	System.out.println(map);
}
}
