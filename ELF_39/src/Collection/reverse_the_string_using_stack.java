package Collection;

import java.util.ArrayList;
import java.util.Stack;

public class reverse_the_string_using_stack {
public static void main(String[] args) {
	String s="basavaraj sp";
	String s1="";
	ArrayList a=new ArrayList();
	for(int i=0;i<s.length();i++) {
		a.add(s.charAt(i));
	}
	Stack s2=new Stack<>();
	for(Object o:a) {
		s2.push(o);
	}
	String s3="";
	while(!s2.isEmpty()) {
		s3+=s2.pop();
	}
	System.out.println(s3);
	
	
}
}
