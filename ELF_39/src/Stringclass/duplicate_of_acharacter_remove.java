package Stringclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class duplicate_of_acharacter_remove {
public static void main(String[] args) {
	List l=new ArrayList<>();
	l.add(1);l.add(2);l.add('a');l.add("hi");
	List h=new ArrayList<>();
	h.add(1);h.add(2);h.add('a');h.add("hello");
	System.out.println(l.containsAll(h));
	
}
}
