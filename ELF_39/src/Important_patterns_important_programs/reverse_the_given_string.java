package Important_patterns_important_programs;

public class reverse_the_given_string {
public static void main(String[] args) {
	String s="my name is raaju";
	char c[]=s.toCharArray();String d="";
	for(int i=c.length-1;i>=0;i--) {
		d=d+s.charAt(i);
	}
	System.out.println(d);
}
}
