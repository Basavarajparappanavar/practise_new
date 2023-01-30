package Important_prgrm;

public class Interview_question_reverse_the_string {
public static void main(String[] args) {
	String s="kanak";String s2="";
	for(int i=s.length()-1;i>=0;i--) {
		s2=s2+s.charAt(i);
	}
	if(s2.equalsIgnoreCase(s)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not");
	}
}
}
