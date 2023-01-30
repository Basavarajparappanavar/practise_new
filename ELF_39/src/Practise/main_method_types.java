package Practise;

public class main_method_types {
 public static void  main(String []arggs) {
	String s="hi basavaraj hello brother";
	String s2[]=s.split(" ");
	String result="";
	for(int i=0;i<s2.length;i++) {
			char ch[]=s2[i].toCharArray();
			for(int j=0;j<s2[i].length();j++) {
				
			if(ch[j]==ch[0]) {
				result+=Character.toUpperCase(ch[0]);
				
			}
			else {
				result+=ch[j];
			}
		}
			result = result + " "; 
			
	}
	System.out.println(result+" ");
	
}
}
