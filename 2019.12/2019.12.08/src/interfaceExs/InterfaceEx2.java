package interfaceExs;

interface Interface1{
	void aa();
}

interface Interface2 {
	void bb();
}

// interface���� ����� �Ұ�쿡�� extends ���, 
// �������̽��� ���߻���� �����ϴ�.
interface Interface3 extends Interface1, Interface2{
	void cc();
}

class Super{
	public void ss(){
		System.out.println("����");
	}
}

class B extends Super implements Interface3{
	public void aa() {}
	public void bb() {}	
	public void cc() {}
}


public class InterfaceEx2 {
	public static void main(String[] args) {
	}

}
