package Stringclass;

public class fetch_the_number_in_the_given_string {
public static void main(String[] args) {
	String s="BMNJKasavaraj113";int sum=0;
//	String digits=(s.replaceAll("[a-z||A-Z]", ""));
//	System.out.println(digits);
//	for(int i=0;i<digits.length();i++) {
//		sum+=Integer.parseInt(digits);
//	}
//	System.out.println(sum);

	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		if(ch[i]>='0'&&ch[i]<='9') {
			sum+=Integer.parseInt(ch[i]+"");
		}
	}
	System.out.println(sum);

}
}
