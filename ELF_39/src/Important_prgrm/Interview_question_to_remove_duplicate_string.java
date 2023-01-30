package Important_prgrm;

public class Interview_question_to_remove_duplicate_string {
public static void main(String[] args) {
	String s="hi hi hww hello hello";
	String s2="";
	String s3[]=s.split(" ");
	for(int i=0;i<s3.length;i++) {
		if(!s2.contains(s3[i])) {
			s2=s2+s3[i]+" ";
		}
	}
	System.out.println(s2);
}
}
