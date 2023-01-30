package Stringclass;

import java.util.Scanner;

public class string_separate {
public static void main(String[] args) {
	String b="sudarshan sudarshan kaashi kaashi basavaraj";
	String c[]=b.split(" ");int k=0;
	for(int i=0;i<c.length-1;i++) {
		if(!(c[i].equalsIgnoreCase(c[i+1]))) {
			c[k]=c[i];
			k++;
		}
	}
		c[k]=c[c.length-1];
		for(int i=0;i<=k;i++) {
			System.out.println(c[i]);
		}
	}
	}
	
	


