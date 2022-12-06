//REMOVING THE 'A' character from the given STRING//
public class example4 {
	public static void main(String[] args) {
		String c="ABCAABCAABC";
		String d="";
		for(int i=0;i<c.length();i++) {
			if (c.charAt(i)!='A') {
				d=d+c.charAt(i);
			}
		}
		c=d;
		System.out.println(c);
		
	}

}


