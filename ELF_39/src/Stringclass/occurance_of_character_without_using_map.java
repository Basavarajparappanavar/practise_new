package Stringclass;

public class occurance_of_character_without_using_map {
public static void main(String[] args) {
	String s="Basavaraj";
	for(char ch='A';ch<='z';ch++) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(ch+" "+count);
		}
	}
	
}
}
