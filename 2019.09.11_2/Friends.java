class Doraemong{
	void fly() {
		System.out.println("�볪�� �︮����");
	}
	void move() {
		System.out.println("���ε� ��!");
	}
	void angry() {
		System.out.println("������ �ʰ� ��!");
	}
	void help(String str) { //� ��Ź�� �����Ŀ� ���� � ������ ��������
	//str �� ���� �������� �ü��ֲ�  " switch "
		switch(str) {
		case "���󿡸� �� �ϴ��� ����;�" :
			fly();
		    break;
		
		case "���󿡸� �� ���ŷ� ���� �;� !" :
			move();
			break;
			
	    default :
	    angry();
		}
	}
}
class Jingoo{ // return : �� ��ȯ/ �޼��� ����
	String wannaFly() {
		return "���󿡸� �� �ϴ��� ����;�";
	}
	String wannaMove() {
		return "���󿡸� �� ���ŷ� ���� �;� !";
	}
	String wannaJavaWell() {
		return "���󿡸� �� �ڹٸ� ���ϰ� �;�!";
	}
}
public class Friends {

	public static void main(String[] args) {
		Doraemong dor = new Doraemong();
		Jingoo jin = new Jingoo();

		dor.help(jin.wannaFly());
		dor.help(jin.wannaMove());
		dor.help(jin.wannaJavaWell());
	}

}
