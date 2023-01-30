package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convertion_of_list_into_array {
public static void main(String[] args) {
	List l=new ArrayList<>();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
//	Object[] a=l.toArray();
//	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i]);
//	}
//	int a[]=new int[l.size()];
//	for(int i=0;i<l.size();i++) {
//		a[i]=(int) l.get(i);
//	}
//	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i]);
//	}
	Object a[]=Arrays.copyOf(l.toArray(),l.size(),Object[].class);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}

