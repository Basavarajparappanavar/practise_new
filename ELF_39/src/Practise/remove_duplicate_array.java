package Practise;

import java.util.Arrays;

public class remove_duplicate_array {
public static void main(String[] args) {
	String a[]= {"raaju","raaju","chethan","chethan","ravi"};int k=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i].length()>a[j].length()) {
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("after sorting");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println();
	for(int i=0;i<a.length-1;i++) {
		if(!a[i].equalsIgnoreCase(a[i+1]) ){
			a[k]=a[i];
			k++;
		}
	}
	System.out.println("after removing duplicates");
	a[k]=a[a.length-1];
	for(int i=0;i<=k;i++) {
		System.out.println(a[i]);
	}
	}
}
