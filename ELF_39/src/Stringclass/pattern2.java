package Stringclass;

import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the rownum");
		int row=a1.nextInt();
		System.out.println("Enter the columnnum");
		int column=a1.nextInt();
		int a;
		a=1;
		for(int i=1;i<=row;i++) {
			if(i%2==1) {
				for(int j=1;j<=column;j++) {
					System.out.print(a++ +"	");
				}
			}
			else {
				for(int j=1;j<=column;j++) {
					System.out.print(a--+"	");
				}
				a=a+2;
				
			}
			a=a+(column-1);
			System.out.println();
		}
	}
}
			
	


