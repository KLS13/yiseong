import java.util.*;
//��ü������ : ��ü���� �����ϴ� ����Ʈ��� ����� ������ ���� ���
public class WrapperClass {

	public static void main(String[] args) {
		//����Ŭ���� : �⺻ �ڷ����� ��ü�� ������
		//�⺻�ڷ����̶�, int double, long, char
		//int a = 3;//�Ϲݺ����� ��ü������ ���� ����
		
		//5 ��� ���� ����Ŭ������ ���κ��� !!
		
		//Integer num1 = new Integer(5);
		//Double num2 = new Double(3.14);
		// --> �ڽ�
		
		//int fromNum1 = num1.intValue();
		//�������ִ� 5��� ���� ������ ��ȯ���ش�
		//double fromNum2 = num2.doubleValue();
				//--> ��ڽ�
		
		//int thirtyOne = Integer.parseInt("31");
		///System.out.println(thirtyOne);
		
		
		
		//String two = Integer.toString(2);
		//������ ���ڿ��� �ٲ��ְ� �ʹ�!
		
				
	   // Integer num3 = Integer.valueOf("31");
 		//���ڿ��� ����Ŭ������.  "31"�� ���� 31�� �ٲ�
	    //�׷������� �ڽ̵ȴ�.
	    
	    //Integer num4 = 10;// int���� num4�� �׳� ���� --> �ڱⰡ �˾Ƽ� �ڽ��� �ϰ� �ȴ�
	                      // Integer num4 = new Integer(10);  �̰Ͱ� ����  "���� �ڽ�"
	    
	    //int fromNum4 = num4.intValue(); //��ڽ�
	                                    // int fromNum4 = num4;  �̰Ͱ� ����  "���� ��ڽ�"
	    
	   // System.out.println(Long.MAX_VALUE);
	    //long(8����Ʈ) �̶�� �ڷ������� ǥ���Ҽ�  ���ǹ��� : 64��Ʈ��ŭ
	    
	    //����Ŭ������ ���� ����! BUT �Ϲ��ڷ����� ���ؼ� �޸𸮸� ���� �����Ѵ�.
	    //���� �� �ʿ��� ��찡 �ƴ϶�� �׳� �Ϲ��ڷ����� ����ϴ� ���� �޸� ���࿡ ����
	    //���� ���α׷��� ����
	     /* ����Ƚ���� ��������
	      * �޸𸮰� ���� �����Ҽ���
	      * �ڵ尡 �б� ���� �ۼ�
	      */
	    
		System.out.println(System.currentTimeMillis());
		//1970�� 1�� 1�� 0�� ���ķ� �� ms�� �귶���� ��ȯ
		//long������ ��ȯ
		Scanner input = new Scanner(System.in);
		//�ý��ۻ� �Է��� �޵��� �ϰڴ�.
		
		
	}

}
