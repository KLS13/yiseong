import java.util.*;

public class ArrayCopy {

	public static void main(String[] args) {
	
		int[] a = {1,2,3,4,5,6};
		int[] b = {0,0,0,0,0,0,0};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.arraycopy(a,2,b,3,4);
		System.out.println(Arrays.toString(b));

		//1.����°�� �ִ� ���� ù��° �ִ� ���� ������ ����
		//2. 2�� ��: a�� 2��°ĭ���� ����
        //3. 3�� ��: b�� 3��ĭ���� ���縦 ����
		//4. 4�� ��: 4���� ���� �����Ѵ�.
	}

}
