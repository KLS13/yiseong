package interfaceExs;

public class InterfaceEx1 {

	public static void main(String[] args) {		

	}
}

interface Inter1{
	abstract public void aa();
}

interface Inter2{
	void bb();
}

class Myclass implements Inter1, Inter2{
	public void aa(){}
	public void bb(){}
}




