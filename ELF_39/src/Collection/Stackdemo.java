package Collection;

import java.util.Stack;

public class Stackdemo {
public static void main(String[] args) {
	Stack s = new Stack();
	s.push("A");
	s.push("B");
	s.push("C");
	System.out.println(s);
	System.out.println(s.peek());
	s.push("S");
	System.out.println(s);
	System.out.println(s.search("S"));
}
}
