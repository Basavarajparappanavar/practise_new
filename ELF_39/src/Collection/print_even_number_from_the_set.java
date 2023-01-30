package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class print_even_number_from_the_set {
public static void main(String[] args) {
HashMap<String, Integer> map=new HashMap<>();
map.put("Java", 1);
map.put("python", 2);
map.put("Html", 3);
for(String o:map.keySet()) {
	System.out.println(o+""+"="+ map.get(o));
}
}
}
