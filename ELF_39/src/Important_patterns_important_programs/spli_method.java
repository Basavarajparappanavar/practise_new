package Important_patterns_important_programs;

public class spli_method {
public static void main(String[] args) {
	String s="My name is raaju";
	String c[]=s.split("Raaju");
	for(int i=0;i<s.length()-1;i++) {
		System.out.print(c[i]);
	}
}
}
