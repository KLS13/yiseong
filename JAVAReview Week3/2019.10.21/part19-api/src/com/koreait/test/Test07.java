package com.koreait.test;
import java.util.Calendar;

//���� ��¥�� StringBuffer, Calendar Ŭ������ �̿��Ͽ�
//"2019�� 10�� 21�� ������ ���� 1�� 10��" �� ���� �������� �ϼ��ϰ� ����Ͻÿ�.
public class Test07 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		StringBuffer sb = new StringBuffer();
		
		//���Ϲ�ȣ�� �ε����� �������!
		//���Ϲ�ȣ   1=��, 2=��, 3=ȭ, 4=�� ���� 7 ��
		String[] weeks = {" ","��","��","ȭ","��","��","��","��"}; // �ε��� 0 �� ���Ϲ�ȣ�� ���⶧��.  
		
		sb.append(now.get(Calendar.YEAR) + "�� ");
		sb.append( (now.get(Calendar.MONTH) + 1) + "�� ");
		sb.append(now.get(Calendar.DAY_OF_MONTH) + "�� ");
		int i = now.get(Calendar.DAY_OF_WEEK);
		sb.append(weeks[i] + "���� ");
		sb.append( now.get(Calendar.AM_PM) == 0 ? "���� " : "���� ");
		sb.append(now.get(Calendar.HOUR) + "�� ");
		sb.append(now.get(Calendar.MINUTE) + "��");
		
		System.out.println(sb.toString());
		
		
		
	

	}

}
