//�迭�ε��� ���ܸ� ó���� �� �ֵ��� �غ���!
public class Exception0 {

	public static void main(String[] args) {
		// try - catch �� �غ���.
		
		try {
			//���ܰ� �߻��� �� �ִ� ����  try�� ����.
			int[] arr = new int[3];
			arr[5]=3;
		}catch(ArrayIndexOutOfBoundsException e  /*� ���ܰ� ����. ������ ����*/) {
			//��� ó���Ұ��ΰ� ?
			System.out.println("���� �߻��߳׿�!");
		}
		

	}

}
