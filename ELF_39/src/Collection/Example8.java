package Collection;

import java.util.ArrayList;

public class Example8 {
	public static void main(String[] args) {
 ArrayList a=new ArrayList();
 a.add(10);
 a.add("hello");
 a.add('a');
 a.add(true);
 for(Object o:a) {
	 System.out.println(o);
		}
 a.add(1,40);
 System.out.println(a);//to add any value in a particular index
	}

}
