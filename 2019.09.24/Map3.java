import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

//���� �˰����� ������������ ����� Ʈ���ʿ� ��������.
//Comparator �������̽��� compare�� ������.
class IntegerComparator implements Comparator<Integer> {
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue();
		//n1�� ������ ������, n2�� ���� ���� ������
	}
}

public class Map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<>(new IntegerComparator());  
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
