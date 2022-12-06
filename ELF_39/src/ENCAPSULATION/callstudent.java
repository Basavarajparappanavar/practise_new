package ENCAPSULATION;

public class callstudent {
	public static void main(String[] args) {

		student b1=new student("Raju",9,12,'A');
		student b2=new student("Rajendra",9,13,'B');
		student b3=new student("Raj",10,14,'C');
		student b4=new student("Rajendra2",11,52,'D');
		student b5=new student("Rajesh",12,121,'E');
		toExecute(b1);
		toExecute(b2);
		toExecute(b3);
		toExecute(b4);
		toExecute(b5);
	}
	//one method//
	/*	System.out.print(b1.getName());
		System.out.print(b1.getStandard());
		System.out.print(b1.getRollnum());
		System.out.print(b1.getSection());
		System.out.println();
		
		
		System.out.print(b2.getName());
		System.out.print(b2.getStandard());
		System.out.print(b2.getRollnum());
		System.out.print(b2.getSection());
		System.out.println();
		
		System.out.print(b3.getName());
		System.out.print(b3.getStandard());
		System.out.print(b3.getRollnum());
		System.out.print(b3.getSection());
		System.out.println();
		
		System.out.print(b4.getName());
		System.out.print(b4.getStandard());
		System.out.print(b4.getRollnum());
		System.out.print(b4.getSection());
		System.out.println();
		
		System.out.print(b5.getName());
		System.out.print(b5.getStandard());
		System.out.print(b5.getRollnum());
		System.out.print(b5.getSection());  */
	
	
	//second method//
		static void toExecute(student b) {
			System.out.println(b.getName()+" "+b.getRollnum()+" "+b.getSection()+" "+b.getStandard());
		}
		
	}


