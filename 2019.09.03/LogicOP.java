
public class LogicOP {

	public static void main(String[] args) {
		
		System.out.println(3>2 && true); // �񱳿����� �����꺸�� �켱����
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true && false || false); // && ������ || �������� ����
		System.out.println(false || 3>2);
		System.out.println(true || false);
		System.out.println(false || false);
		
		
		System.out.println(false ^ true); //
		System.out.println(true ^ true); //

	}
}
