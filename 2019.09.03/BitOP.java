
public class BitOP {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 5;
		
		System.out.println(a|b);
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(a>>2);
		System.out.println(b<<4);
		
		System.out.println(a>b? "�ڸ���":"it");
		
		
		
		
	/*
	 * AND ( �Ѵ� 1�̾�� 1 )
	 * OR  ( �Ѵ� �ϳ��� 1 �̸� 1 )
	 * XOR ( �Ѵ� �޶�� 1 )
	 * >> ��Ʈ2ĭ ����������  :  1111 --> 0011 (3)
	 * << ��Ʈ4ĭ ��������     :  0101 --> 0101 0000 (80)
		00001111   00001111  
		00000101   00000101
		00001111   00000101 
		
		*/
	}
}
