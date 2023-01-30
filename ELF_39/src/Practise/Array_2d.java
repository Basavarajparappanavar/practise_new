package Practise;

import java.util.Scanner;

public class Array_2d {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int [2][4];
	System.out.println("enter the elements in array");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			if(i%2==0&&j%2==0) {
				a[i][j]=sc.nextInt();
			}
//			else {
//				a[i][j]=0;
//			}
//			
		}
	}
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+"	");
		}
			System.out.println();

		}
	}
}

