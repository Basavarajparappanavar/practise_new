package Stringclass;
//to count how many 'A' are present in "JAAVAA" String// 
public class example {
	public static void main(String[] args) {
		String c="JAAVAA";
		int count=0;
		int count2=0;
		for(int i=0;i<c.length();i++) {
			if(c.charAt(i)=='A') {
				count++;
				
			}
			else if(c.charAt(i)=='V') {
				count2++;
			}
		}
		System.out.println(count);
		System.out.println(count2);
	}

}
