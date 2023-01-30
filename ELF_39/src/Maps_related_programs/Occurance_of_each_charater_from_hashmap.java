package Maps_related_programs;

import java.util.HashMap;

public class Occurance_of_each_charater_from_hashmap {
public static void main(String[] args) {
	String s="Apple ball cat done cat apple";
	String ch[]=s.split(" ");
	HashMap<String, Integer> map=new HashMap<>();
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
