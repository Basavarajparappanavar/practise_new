package Stringclass;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the row number");
		int row=a1.nextInt();
		String b="\u001B[37m";
		for(int i=1;i<=row;i++) {
			int a=i;
			if( i==a) {
			for(int j=1;j<=row;j++) {
				System.out.print(b+"		"+a);
				a+=5;
			}
		}
			System.out.println();
		}
	}
}
			/*else if( i==2) {
				for(int j=1;j<=5;j++) {
					System.out.print(a+" ");
					a+=5;
	}

}
			else if( i==3) {
				for(int j=1;j<=5;j++) {
					System.out.print(a+" ");
					a+=5;
	}
			}
				else if( i==4) {
					for(int j=1;j<=5;j++) {
						System.out.print(a+" ");
						a+=5;
		}
				}
				else if( i==5) {
					for(int j=1;j<=5;j++) {
						System.out.print(a+" ");
						a+=5;
		}
				}
			System.out.println();
			}
		}
	
}*/
	
