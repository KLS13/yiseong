package com.koreait.ex;

public class Ex04_PrimitiveType {

	public static void main(String[] args) {

		/*
		 1. �⺻ �ڷ���
		  1) byteŸ��
		 	- ũ�� : 1����Ʈ
		 	- ���� : 2�� 8����(256��)
		 	- ���� : -128 ~ 127 ( -2�� 7���� ~ 2�� 7���� )
		  2) short
		    - ũ�� : 2����Ʈ
		    - ���� : 2�� 16���� (65,636��)
		    - ���� : -32,768 ~ 32,767
		  3) int
		  	- ũ�� : 4����Ʈ
		  	- ���� : 2�� 32����
		  	- ���� : -2147483648 ~ 2147483648
		  	
		  4) long
		  	- ũ�� : 8����Ʈ
		  	- ���� : 2�� 64����
		  	- ���� : -9223372036854775808 ~ 9223372036854775807
		  	
		  5) int�� ����� ���� ���̻� L ǥ��
		  6) long ���� ó���� �ȵǴ� ���ڴ� BigInteger �̿�
		  
		  ���� ����
		  1. �ƹ������� ���� ����
		  2. �������� ù ���ڸ� �ҹ��ڷ��ϰ� camel case ���
		  	 ( �� �ܾ��� ù ���ڸ� �빮�ڷ� �ϰ�, �������� �ҹ��ڷ� �Ѵ�.
		  	 �� : myAge 
		  3. ����,����,����(_), �ѱ��� ����.
		  */
		
		//�ڵ� ���� : Ŀ���� �ΰ� ctrl + Alt + ��;
		//�ڵ� ���� : Ŀ���� �ΰ� ctrl + Alt + ��;
		byte var1 = 127;
		short var2 = 32767;
		int var3 = 21000;
		long var4 = 1000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		/*
		  �Ǽ���
		  float
		   - ũ�� : 4����Ʈ
		   - ���� : ��ȣ + ���� + �Ҽ�
		   - ���� : -1.4E-45 ~ (��ȣ : -, ���� : E-45 10�� -45����)
		  double
		   - ũ�� : 8����Ʈ
		   - ���� : -4.0E-324 ~
		  ��� �Ǽ����� ������ �ִ�.
		 */
		float var5 = 3.14f;
		double var6 = 3.14;
		
		System.out.println(var5);
		System.out.println(var6);
		
		/*
		 ������
		  char
		   - ũ�� : 2����Ʈ( C�� char�� 1����Ʈ )
		    ���� 1����Ʈ , �ѱ� 2����Ʈ
		    
		    �ڵ�
		    ASCII : 1����Ʈ ���� ǥ�� �ڵ�
		    UNICODE : 2����Ʈ ���� ǥ�� �ڵ�
		    
		     */
		char ch1 = 'A';
		char ch2 = '��';
		
		System.out.println(""+ch1 + ch2);
		
		/*
		 ����
		  boolean
		   - �� : true
		   - ���� : false
		   - ���� ������, �� �������� ��� 
		   - ������ : is �� �����ϴ� ���� �Ϲ���
		
		 ���ڿ�
		  String
		   - ���� �ڷ���
		   - ���� �������� �ʰ� �ּҸ� ����
		   
		  String str1 = new String("Java");
		  	  
		 */
		boolean isPositive;
		isPositive = true;
		if(isPositive) {
			System.out.println("����̴�");
		}
		String str = "Hello";
		System.out.println(str);

	}

}
