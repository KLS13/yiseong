
public class BitOP {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 5;
		
		System.out.println(a|b);
		System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(a>>2);
		System.out.println(b<<4);
		
		System.out.println(a>b? "코리아":"it");
		
		
		
		
	/*
	 * AND ( 둘다 1이어야 1 )
	 * OR  ( 둘다 하나만 1 이면 1 )
	 * XOR ( 둘다 달라야 1 )
	 * >> 비트2칸 오른쪽으로  :  1111 --> 0011 (3)
	 * << 비트4칸 왼쪽으로     :  0101 --> 0101 0000 (80)
		00001111   00001111  
		00000101   00000101
		00001111   00000101 
		
		*/
	}
}
