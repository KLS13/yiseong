import java.lang.reflect.Array;
import java.util.*;

public class ArrayBasic {

	public static void main(String[] args) {
		
		// int�� ������ 100�� ����.
		// �迭����
		int[] arri; // arri ��� �̸��� �迭����
		double[] arrd;
		//arri �� arrd �� ��������
        // new ��� �����ڸ� ����ϸ� �迭���������
		
		arri = new int[5]; // arri �� 5ĭ
		int[] a = new int[3];
		// a ��� �迭�� int�� ������ 3ĭ
		a[0]=3;
		a[1]=6;
		a[2]=9;
		for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	   }
		
		a[0]=a[1];
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
	   }

		int[] bbb = {1,3,5,7,9};
		//�˾Ƽ� �ټ� ĭ¥�� �迭�� ���������, 1 3 5 7 9 �� �˾Ƽ� �������� ����.
		System.out.println("---------------------");
		int[] ccc = new int[] {1,3,5,7,9};
		for(int i=0; i<ccc.length; i++) {
			System.out.println(ccc[i]);
	   }
		System.out.println("�迭�� ���̴�" + ccc.length);
		
	}
}
