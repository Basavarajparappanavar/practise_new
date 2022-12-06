package Stringclass;

public class EXAMPLE5 {
	public static void main(String[] args) {
		String c="AABBCC";
		for(int i=0;i<c.length();i++) {
			if(i%2==1) {
			int d=c.indexOf("AABBCC");
			for(int j=0;j<=d;j++) {
				System.out.println(c.charAt(j
						));
			}
		}
		}
	}

}
