package Collection;

import java.util.ArrayList;

public class Example7 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(1);
		a.add("hello");
		a.add(true);
		System.out.println(a.indexOf(1));//we go for lastindexof becauseindexOf() start searching eliment from 0index
		System.out.println(a.lastIndexOf(1));
		
	}

}
