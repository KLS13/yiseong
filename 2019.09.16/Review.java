// ����Ŭ���� : Ŭ���� �ȿ� �ִ� Ŭ���� (��øŬ����)

class Outer{
	class Inner{
		//�̰��� ����Ŭ����
	}
}

class Girl{
	void sayHello() {
		System.out.println("�ȳ�");
	}
}
////////����Ŭ������ ����/////////
// 1. �ν��Ͻ� Ŭ���� (�ٸ� �ν��Ͻ� ����� ���� ����)
// 2. ����ƽ Ŭ���� ( static - ��ü���������ʾƵ� ����O , ��簴ü���� )
// 3. ���� Ŭ���� (������ ���� ��(�޼��� ����)������ ��ȿ )

// �͸� Ŭ���� : ������ ���´�� ������� �ʴ� �Ͻ����� Ŭ����
public class Review {

	public static void main(String[] args) {
		Girl girl1 = new Girl();
		girl1.sayHello();
		
		Girl chineseGirl = new Girl() {
			// ��ó�� �����ϴ°��� �͸�Ŭ����
			// �������̵� ����!
			void sayHello() {
				System.out.println("NiHao");
			} // 1ȸ��
		};
		chineseGirl.sayHello();
		
		//�迭�ε��� ����
		int[] arr = new int[3];
		arr[5] = 3; // �߸��� �־�̱��ϳ�, ������ ����  ArrayIndexOutOfBoundsException
		}
		
		
	}

////////////////////////////////////////
// ����ó��(Exception)
// ����(Error) - ���α׷��� ������ �� ���� ����� ����!
// --> �������� ������ ���� ����.