package Important_patterns_important_programs;

public class removing_duplicate_value_from_String {
public static void main(String[] args) {
	String s="kerala"
			+ "";
	char c[]=s.toCharArray();
	String d="";
	for(int i=0;i<c.length;i++) {
		if(d.indexOf(c[i])==-1){
			d=d+c[i];
		}
	}
	System.out.println(d);
}
}
