

package Important_patterns_important_programs;

public class String_highest_length {
public static void main(String[] args) {
	String s="My name is basavaraj";
	String s2[]=s.split(" ");
	int count=0;
	
	String max=s2[0];
	for(int i=0;i<s2.length;i++) {
		 countAlpha(s2[i]);
		 if(countAlpha(s2[i])>count
				 
				 ) {
			 max=s2[i];
		 }
	}
	System.out.println(max);
	
}
public static int countAlpha(String s1) {
	int count=0;
	for(int i=0;i<s1.length();i++) {
		count++;
	}
	return count;
}

}
