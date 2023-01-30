package Stringclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class A {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range of values boss");
		String s2=s.next();int sum=0;
		s2=s2.replaceAll("[a-z||A-Z]", "");
		char ch[]=s2.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0') {
				sum+=Integer.parseInt(ch[i]+"");
			}
		}
		System.out.println(sum);
	}
	}
