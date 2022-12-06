package Important_patterns_important_programs;

import javax.lang.model.element.Element;

public class highesh_string {
public static void main(String[] args) {
	String s="My name is Basavaraj sjkgdjdhkjdhjd";
	String s2[]=s.split(" ");
	int k=0;String more_length;
	for(int i=0;i<s2.length-1;i++) {
  String  element=s2[i];
    String next_element=s2[i+1];
    int max=next_element.length();
    int count=element.length();
    	if(max<count) {
    		more_length=s2[i+1];
    	}
    	s2[k]=s2[s2.length-1];
    	int maximum=s2[s2.length-1].length();
    	for(int i1=0;i1<=k;i1++) {
    		String max_length_word;
    		if(count<maximum) {
    			max_length_word=s2[i1];
    			System.out.println(s2[i1]+"is the largest");
    		}
    		
    	}
    
	}
}
}
