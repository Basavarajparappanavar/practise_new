package ENCAPSULATION;

public class student {
	private String Name;
	private int Standard;
	private int rollnum;
	private char section;
	student(String Name,int Standard,int rollnum,char section){
		this.Name=Name;
		this.Standard=Standard;
		this.rollnum=rollnum;
		this.section=section;
	}
	public String getName() {
		return this.Name;
	}

	public int getStandard() {
		return this.Standard;
	}
	public int getRollnum() {
		return this.rollnum;
	}
	public char getSection() {
		return this.section;
	}
	public void setName(String Name) {
		Name=Name;
	}
	public void setStandard(int Standard) {
		Standard=Standard;
	}
	public void setRollnum(int rollnum) {
		rollnum=rollnum;
	}
	public void setSection(char section) {
		section=section;
	}


}
