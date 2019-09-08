public class ReView {

	public static void main(String[] args) {
		// if , else if , switch 복습
		int num = 3;
		
		if(num ==3) {
			System.out.println("참!");
		}
		
		if(num ==3) {
			System.out.println("참!");
		} else {
			System.out.println("거짓!");
		}
		
		if(num == 3) {
			System.out.println("3이야!");
		}else if( num ==2) {
			System.out.println("2야");
		}else if( num ==1) {
			System.out.println("1이야");
		}else {
		    System.out.println("아무것도 아님");
		}

		switch(num) {
		case 1 :
			System.out.println("1임");
			break;
		case 2 :
			System.out.println("2임");
			break;
		case 3 :
			System.out.println("3임");
			break;
		default :
			System.out.println("아무것도 아님");
			break;
		}
		
		
		}
}
