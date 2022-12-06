package Stringclass;

import java.util.Scanner;

public class pattern3 {
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the row number");
		int row=a1.nextInt();
		System.out.println("Enter the column number");
		int column=a1.nextInt();
		for(int i=1;i<=row;i++) {
			int a=i;
			if(i==1) {
				for(int j=0;j<=5;j++) {
					if(j%2==1) {
						System.out.print(a);
					}
					else {
						a++;
						System.out.print(a);
					}
				}
					System.out.println();
				}
			}
		}
	}


