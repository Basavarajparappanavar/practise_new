package Practise;

public class Pattern3 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==1) {
				for(int k=1;k<=5;k++) {
				System.out.print("* ");
			}
			}
			else {
				for(int j=1;j<=5;j++) {
					if(j==5) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
					
				}
			}
				System.out.println();
			
			
		}
		}
	
	}

