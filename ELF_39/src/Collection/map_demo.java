package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class map_demo {
public static void main(String[] args) {
	HashMap<String, Integer> map=new HashMap<>();
	map.put("ch", 1);
	map.put("ch", 2);
	map.put("ch", 3);
	System.out.println(map);
	System.out.println(map.get("ch"));
	map.remove("ch");
	System.out.println(map
			);
	
}
}
