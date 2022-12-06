package Collection;

import java.util.Vector;

public class Vectordemo {
public static void main(String[] args) {
	Vector v=new Vector();
	System.out.println(v.capacity());
	for(int i=0;i<=9;i++) {
		v.addElement(i);
	}
	System.out.println(v);
	v.addElement("m");
	System.out.println(v.capacity());
}
}
