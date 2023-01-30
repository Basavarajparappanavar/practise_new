package Important_prgrm;

public class First_letter_of_the_sentence_should_be_capital {
public static void main(String[] args) {
	String s="hih mym namen is basavaraj";
	String s1[]=s.split(" ");String s2="";
	for(int i=0;i<s1.length;i++) {
		char ch[]=s1[i].toCharArray();
		for(int j=0;j<ch.length;j++) {
			if(j==0) {
				s2+=Character.toUpperCase(ch[j]);
			}
			else {
				s2+=ch[j];
			}
		}
		s2+=" ";
	}
	System.out.println(s2);
}
}
