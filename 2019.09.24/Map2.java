import java.util.HashMap;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		//--> Ʈ�������� �ٲٸ� ű���� ������ ���Եȴ�.
		
		//put = ������ ����. ������ �ű��� ����
		map.put(7, "son");
		map.put(10, "messi");
		map.put(21, "pirlo");
		//���� key���� �������� �����Ϳ� ����
		Set<Integer> ks = map.keySet();
		//key�� ���ִ� ����(set)�� ��ȯ
		//�ߺ���� �ȵǰ�, ������ �ȸű�
		
		for(Integer i : ks) {
			System.out.print(i + "\t");
			
		}
		System.out.println("");
		for(Integer i : ks) {
			System.out.print(map.get(i) + "\t");
		}
	}

}
