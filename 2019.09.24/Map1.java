import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		//Key���� Integer, value���� String�� ���� �����.
		
		//put = ������ ����. ������ �ű��� ����
		map.put(7, "son");
		map.put(10, "messi");
		map.put(21, "pirlo");
		//���� key���� �������� �����Ϳ� ����
		
		System.out.println(" no 7 : " + map.get(7)); //get�� �� �� Ű���� �־��ָ�, ������ ��ȯ
		System.out.println(" no 10 : " + map.get(10));
		System.out.println(" no 21 : " + map.get(21));
		/*
		 * ���� �⺻������ iterator �޼ҵ� ��������.  (�ݺ��� ���� �Ұ�)
		 * Ű���� ���� ���� �����͸� ���� �� �ֵ�.
		 */
		
		
		//���ﶧ�� Ű�� ����.
		map.remove(7);
		//�����Ͱ� ������ Null�� ��ȯ��.
		System.out.println("No7 :" + map.get(7));
		

	}

}
