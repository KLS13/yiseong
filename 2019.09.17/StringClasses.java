//���ڿ��� ��Ÿ���� �� �ٸ� Ŭ������ ���� String Ŭ���� ���� ����
public class StringClasses {

	public static void main(String[] args) {
		String str = new String();
		str = "Hello";
		String str2 = str.concat("Girl");
		
		System.out.println(str.concat("Boy")); //HelloBoy
		System.out.println(str.substring(2)); //substring(2) : n���� ����, 2���� ����  llo
		System.out.println(str);
		
		
		StringBuffer strbuffer = new StringBuffer();
		strbuffer.append("Hello"); // Hello
		strbuffer.append("Hello2"); // Hello Hello2
		strbuffer.reverse(); //���ڿ� ������
		System.out.println(strbuffer); // 2olleHolleH
		
		//String ��ü�� ������ �״�� ����, StringBuffer ��ü�� ������ ����
		//String Ŭ������ immutable(�Һ�)Ŭ����
		//--->�޼��� ȣ�� �ÿ� ���ο� ��ü�� �����Ͽ� ��ȯ
		//StringBuffer Ŭ������ mutable(����)Ŭ����
		//--->�޼��� ȣ�� �ÿ� �ڱ� �ڽ��� ��ȯ�մϴ�!
	}

}
