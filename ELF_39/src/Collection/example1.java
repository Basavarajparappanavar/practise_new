package Collection;

public class example1 {
public static void main(String[] args) {
	String b="ELF35OCT15";
	String [] c=b.split("");
	int sum=0;
	/*
	 * for(int i=0;i<c.length;i++) {
	 * 
	 * int d=Integer.parseInt(c[i]); if(d<=9) { sum+=d; } System.out.println(sum); }
	 */
	for(int i =0;i<b.length();i++) {
		char ch=b.charAt(i);
		if(ch>='0' && ch<='9') {
			String s1=""+ch;
			int d=Integer.parseInt(s1);
			sum=sum+d;
			
		}
		
	}
	System.out.println(sum);
	
	
	
}
}
