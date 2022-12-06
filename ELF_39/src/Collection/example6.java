package Collection;

import java.util.ArrayList;

public class example6 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add("hello");
		a1.add('a');
		a1.add(true);
		System.out.println(a1);
		a1.remove("hello");
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		a1.remove(new Integer(1));
		System.out.println(a1);
	}

}
