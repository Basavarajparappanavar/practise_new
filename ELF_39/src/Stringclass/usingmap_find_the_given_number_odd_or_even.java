package Stringclass;

import java.util.HashMap;
import java.util.Scanner;

public class usingmap_find_the_given_number_odd_or_even {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
	}
	int k=1;
	HashMap<Integer , Integer> h=new HashMap<>();
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
		h.put(k++, a[i]);
	}
		
	}
System.out.println(h);
}
}
