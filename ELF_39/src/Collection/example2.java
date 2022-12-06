package Collection;
// convertion of non primitive type into primitive i.e Unboxing//
public class example2 {
	public static void main(String[] args) {
		Integer a=10;
		int b=a.intValue();
		System.out.println(b);
		
		Character c='A';
		int d=c.charValue();
	System.err.println(d);
	
	Integer e=65;
	char f=(char)e.intValue();
	System.err.println(f);
	}

}
