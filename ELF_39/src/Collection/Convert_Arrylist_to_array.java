package Collection;

import java.util.ArrayList;

public class Convert_Arrylist_to_array {
public static void main(String[] args) {
	ArrayList a=new ArrayList<>();
	a.add(10);a.add('M');a.add("add");
	Object b[]=new Object[a.size()];
	for(int i=0;i<a.size();i++) {
	b[i]=a.get(i);
	}
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}
}
}
