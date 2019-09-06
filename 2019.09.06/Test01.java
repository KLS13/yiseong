public class Test01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x << 33); // 011 << 1   110
		// x´Â int(32ºñÆ®)
		System.out.println(y >= 5 || x < 0 && x>2); //TRUE || FALSE && FALSE  --> TRUE
		System.out.println(y += 10 - x++); // X=13
		System.out.println( x += 2); // X=5
		System.out.println(! ('A' <= c && c<= 'z')); // TRUE && TRUE    FLASE
		System.out.println('C'-c); // 67 - 65 = 2
		System.out.println('5' - '0'); // 5 - 0 = 5 
		System.out.println(c); //65 + 1 = 66  
		System.out.println(++c); // B
		System.out.println(c++); //B   c=68
		System.out.println(c); // C
		
		
		
		

	}

}
