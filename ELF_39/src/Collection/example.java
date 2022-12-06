package Collection;
//before jdk1.5 programmer used to Boxing explicitly// 
public class example {
	int c=0;
	public static void main(String[] args) {
		/*int a=10;
		Integer b=Integer.valueOf(a);
		System.out.println(b);
		System.err.println(a);
		
	}

}*/
//after jdk 1.5 Boxing is done implicitly////boxing means converting primitive data type into non primitive data type//
int a=10;
Integer b=a;
System.out.println(b);
boolean c=true;
Boolean b1=c;
System.out.println(b1);
	}
}
