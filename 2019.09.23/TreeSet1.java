import java.util.*;
//���� : ������ ��Ģ�� ���ؼ� ���ŵ� ����
// -> ��������, ��������, ���ĺ���, �����ټ�, ���
//Ʈ������ ������ �¿� ���� ����� �߰��� ��
//Ʈ���� �ϳ��� �ڷᱸ���̴�.



//Comparator �񱳿� ���� ����� �����ϵ��� �ϴ� �������̽�
class IntegerComparator implements Comparator<Integer> {
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue();
	}
}
// n1 �� ���������� �� �������� ���ִ�
// n2 �� ���� ������   ex) 1 2 3 4   -->   4 �� n1  ,  5�� �������ϸ�  5�� n2
                  // n1 - n2 = 4 - 5 = -1  ����,  compare ��ȯ���� ������, ������ �����Ѵ�
                  // compare ��ȯ���� �����, ������ �����´�.
 				  // �ߺ��� �������������,  0 �� ��쿡�� ������ �����Ѵ�.

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ts = new TreeSet<>(new IntegerComparator());
		
		ts.add(3);
		ts.add(1);
		ts.add(2);
		ts.add(4);
		// 3-1-2-4  �⺻������ Ʈ������ �������� ����
		
		Iterator it = ts.iterator();
		System.out.println("<TreeSet>��� : ");
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		System.out.println("\n ���� TreeSet�� ũ�� : " + ts.size());  //size : ����� ����
	}

}
