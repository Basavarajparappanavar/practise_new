package Collectionarry;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add('A');
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.add(2,"M");
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		System.out.println(l.indexOf("M"));//2
		System.out.println(l.size());//4
		System.out.println(l.contains("M"));//true
		System.out.println(l.isEmpty());//false
		l.clear();
		System.out.println(l);//[]
		System.out.println(l.isEmpty());//true
		}

}
