package Important_prgrm;

public class Interview_question_reverse_the_in_the_given_sentence {
public static void main(String[] args) {
	String s="my name is Basavaraj";
	String s2[]=s.split(" ");String s3="";
	for(int i=0;i<s2.length;i++) {
		for(int j=s2[i].length()-1;j>=0;j--) {
			s3=s3+s2[i].charAt(j);
		}
		s3+=" ";
	}
	System.out.println(s3);
}
}
