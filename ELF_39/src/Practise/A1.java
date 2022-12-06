package Practise;

public class A1 {
	public static void main(String[] args) {
		int a=65;
		for(int i=1;i<=4;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print((char)a);
				a++;
			}
			
			System.out.println();
		}
	}

}
