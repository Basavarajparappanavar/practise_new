package Important_patterns_important_programs;

public class Array_of_object {
String Name;
int id;
static int count=0;
Array_of_object(String Name,int id){
	this.Name=Name;
	this.id=id;
System.out.println(this.Name+" "+this.id);
}
public static void main(String[] args) {
	Array_of_object e1=new Array_of_object("Rahul",1);
	Array_of_object e2=new Array_of_object("Sud",2);
	//Array_of_object e[]=new Array_of_object[count];
//	e[0]=e1;
//	e[1]=e2;
//	for(int i=0;i<e.length;i++) {
//		System.out.println(e[i].Name+" "+e[i].id);
	
	
}
}
