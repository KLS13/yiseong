interface Printable {
	void print(String s);
}

//����ǥ���� : �޼ҵ带 ǥ���ϴ½� �����ϰ�.

//JAVA �����Ϸ�(�ؼ�) --> JVM(����)
//--> �����Ϸ��� �˰��ִ� ��ǿ� ���ؼ� �ִ��� �ۼ���������
class Lambda1 {

	public static void main(String[] args) {
		Printable prn = (s) -> { System.out.println(s); };
				
		prn.print("�ȳ�!");
	} //�͸�Ŭ������ Ȱ���Ͽ� �Ͻ������� ��ü ���� ����

}
