package Stringclass;

public class assignment2 {
	public static void main(String[] args) {
		String c="hi hello the hi the the the";
	String [] d=c.split(" ");
	int count=0;
	for(int i=1;i<d.length;i++) {
		if(d[i].startsWith("the")){
		count++;
		}
	}
	System.out.println(count);
	}
}

