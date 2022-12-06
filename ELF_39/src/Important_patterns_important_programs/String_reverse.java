package Important_patterns_important_programs;

public class String_reverse {
public static void main(String[] args) {
	String s="Hnh";String d="";
	for(int i=s.length()-1;i>=0;i--) {
		d=d+s.charAt(i);
	}
	System.out.println(d);
	if(s.equalsIgnoreCase(d)) {
		System.out.println("reversed");
	}
	else {
		System.out.println("not reverse");
	}
	
	
}
}
