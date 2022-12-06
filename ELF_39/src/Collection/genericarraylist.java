package Collection;

import java.util.ArrayList;

public class genericarraylist {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();//Genric Arraylist which accepts only homogenous elements
		
		a.add(11);
		a.add(12);
		a.add(105);
		for(Integer o:a) {//FOREACH LOOP
			System.out.println(o);
		}
			ArrayList b=new ArrayList();
			b.add(11);
			b.add("m");
			b.add(a);
			System.out.println(b);
			System.out.println(b.size());//size will be 3 because all elements of a object is considered as single object 
			b.addAll(a);
			System.out.println(b);//using addAll() each and every element considered individually
			System.out.println(b.size());
			System.out.println(b.removeAll(a));
			System.out.println(b);
		System.out.println(a.removeAll(b));
	}

}
