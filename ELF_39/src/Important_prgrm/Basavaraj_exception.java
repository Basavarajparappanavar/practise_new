package Important_prgrm;

public class Basavaraj_exception extends RuntimeException {
	public String getnumber(int i) {
	if(i==0) {
		throw new Basavaraj_exception();
	}
	else {
		return "it is not zero";
	}

}
}
