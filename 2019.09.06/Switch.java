public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		
		switch(num/2) {
		
		case 1 : 
			System.out.println("답은 1");
			break; // case 문을 끝내는 역할. 
		case 2 :
			System.out.println("답은 2");
			break;
		case 3 :
			System.out.println("답은 3");
			break;
			
			default :  // 모든 case에 해당사항이 없을때
				System.out.println("없음ㅋ");
				break;
		}
	}

}
