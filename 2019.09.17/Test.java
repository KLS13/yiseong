class AAA{
	AAA(){
		//��ü�� ���Ӱ� �����ɶ����� �ݵ�� ȣ��
		System.out.println("����!");
	}
	//��ü�� ������� ȣ��Ǵ� �޼��嵵 ����.
	//finalize();
}
//API
//���ø����̼� ���α׷��� �������̽�
//�������α׷��� ���� �� ���� �Ǵ� ��ɵ��� �̹� ������� �ִ� ��
public class Test {

	public static void main(String[] args) {
		System.out.println("�ȳ�");
	//�츮�� println�� �������� ������ �̹� �־����ֵ�. API �̴�
	//���콺 Ŀ���� ������ �� �δ� ��: Hover �Ѵ�.
		
		String str = "�ڹ� ����";
		String lie = new String("�ڹ� �ְ�");
		int a = 3;
		double b = 3.14;
		//int, double�� �Ϲ� �ڷ���
		//�׷���, String �� �Ϲ��ڷ����� �ƴ�, Ŭ�����̴� !
		// a,b�� �Ϲݺ���, str�� ��������
	}

}
