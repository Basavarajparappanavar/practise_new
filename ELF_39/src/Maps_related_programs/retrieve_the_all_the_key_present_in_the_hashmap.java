package Maps_related_programs;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.Set;

public class retrieve_the_all_the_key_present_in_the_hashmap {
public static void main(String[] args) {
	HashMap<Integer, String>map=new HashMap<>();
	map.put(1, "AAA");
	map.put(2, "BBB");
	map.put(3, "CCC");
	Set<Entry<Integer, String> >list=map.entrySet();
	for(Entry<Integer, String> s:list) {
		System.out.println(s);
	}
	System.out.println(map);
}
}
