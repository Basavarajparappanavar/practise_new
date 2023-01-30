package Important_prgrm;

public class Interview_question_to_make_first_character_of_string_as_capital {
public static void main(String[] args) {
	String s="hi my name is Basavaraj";
	String s2[]=s.split(" ");
	String s3="";
	for(int i=0;i<s2.length;i++) {
		char ch[]=s2[i].toCharArray();
		for(int j=0;j<ch.length;j++) {
			if(j==0) {
				s3=s3+Character.toUpperCase(ch[0]);
			}
			else {
				s3=s3+ch[j];
			}
			
		}
		s3=s3+" ";
	}
	System.out.println(s3);
}
}
