package Stringclass;

public class eample6 {
	public static void main(String[] args) {
		String c="ABCD";
		char a[]=c.toCharArray();
		String rev="";
		for(int i=0;i<a.length;i++ ) {
			rev=a[i]+rev;
		}
		
		System.out.println(rev);
	}
	}

