package Exceptionalhandeling;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int a[][]=new int [sc.nextInt()][sc.nextInt()];int value=10;int value2=1;int k=1;
		int sum=0;
		System.out.println("enter the column");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i%2==0&&j%2==0) {
					a[i][j]=value*k++;
				}
				else {
					a[i][j]=value2++;
				}
				
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
					if(i%2==0&&j%2==0) {
						System.out.print(a[i][j]+"	");
						sum+=a[i][j];
					}
				}
			System.out.println();
			}
		System.out.println(sum);
		}
		
	}


