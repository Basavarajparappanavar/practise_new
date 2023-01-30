package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import PACKAGE1.A;

public class Arraylist_iterating_values {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<>();
	a.add("1");
	a.add("apple");
	
	a.add("v");
	a.add("null");
	a.add("true");
//	for(Object o:a) {
//		System.out.println(o);
//	}
//	Iterator l=a.iterator(); 
//	while(l.hasNext()) {
//		System.out.println(l.next());
//	}

//for(int i=0;i<a.size();i++) {
//	System.out.println(a.get(i));
//}
	ListIterator<String> l=a.listIterator();
	while(l.hasPrevious()) {
		System.out.println(l.previous());
	}
	//ListIterator<String> m=a.listIterator();
	while(l.hasNext()) {
		System.out.println(l.next());
	}
}
}