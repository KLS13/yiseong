import java.util.*;
//�ؽ��� �⺻����
// 1. ������ �ű��� ���� (���� ���� �������� ����)
// 2. �ߺ��� ������� ����. (���� ������ ������ �������� ����)
public class Hashset1 {

	public static void main(String[] args) {
		//���׸� ����̴�.
		HashSet<String> set = new HashSet<>();
		
		//add : ��� �߰��ϱ�
		set.add("Toy");
		set.add("Story");
		set.add("Fun");
		set.add("Fun"); //�ߺ��̹Ƿ� ��������
		//�ߺ� �Ǵ� ����
		// hashcode() �� ����.
		// equals() �� ����
		Iterator<String> itr = set.iterator(); // ������ �����͸� ����� Iterator! ���׸� ���
		//set.iterator() : set�� ����� ���������� ��ȯ�Ѵ�.
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} // hasNext() : ���� �����Ͱ� ������ true ��ȯ
		  // next : ������ �о���̱� !
		  // ���� �����Ͱ� ���� ������ �б�.
		for(String s : set) {
			System.out.println(s);
		} // for-each��
		
		int[] arr = new int[5];
		for(int i : arr) {
			System.out.println(arr[i]);
		}

	}

}
