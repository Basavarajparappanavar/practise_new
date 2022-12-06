
package Stringclass;

public class assignment5 {
public static void main(String[] args) {
	String s1="dolu bolu Raju chutki ankitha Anusara aunty";
	String c[]=s1.split(s1);String s2="";
	for(int i=0;i<c.length;i++) {
		if(c[i].startsWith("a")&&c[i].endsWith("a")) {
			for(int j=c.length-1;j>=0;j--) {
				System.out.println(s2);
			}
			
		}
	}
	System.out.println(s2);
	
	
}
}
