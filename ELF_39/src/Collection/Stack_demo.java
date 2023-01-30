package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Stack_demo {
public static void main(String[] args) {
	Vector s=new Vector();
	s.addElement(1);
	s.addElement(2);
	s.addElement(3);
	s.addElement(4);
	System.out.println(s);
	Iterator itr=s.iterator();
	while (itr.hasNext()) {
		Integer i=(Integer)itr.next();
		if(i%2==0) {
			System.out.print(i);
		}
		
	}
	}
}

