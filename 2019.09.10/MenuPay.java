import java.util.Scanner;

public class MenuPay
{

	public static void main(String[] args) {
		
		int i ;
		int chance = 0;
		String pay = "";
		
	
        while(true){ 
        		
		System.out.println("원하시는 메뉴의 번호를 입력하세요.");
		System.out.println("1.햄버거 2. 피자 3. 치킨 4. 음료수 5. 결제하기");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		
		if(i==5) {
			System.out.println("총 주문 건수는 " + chance + " 건 입니다. 결제하시겠습니가?");
			System.out.println("카드결제는 카드를 입력해주세요.");
			System.out.println("현금결제는 현금을 입력해주세요.");
			Scanner input2 = new Scanner(System.in);
			pay = input2.nextLine();
			if(pay.equals("카드")){
				System.out.println("카드를 넣어주세요.");
				System.out.println("----------------");
				System.out.println("-----인식중------");
				System.out.println("-----결제중------");
				System.out.println(chance + " 건에 대한 결제가 완료되었습니다.");
			} else if(pay.equals("현금")) {
				System.out.println("현금을 넣어주세요.");
				System.out.println("----------------");
				System.out.println("-----인식중------");
				System.out.println("-----결제중------");
				System.out.println(chance + " 건에 대한 결제가 완료되었습니다.");
			}else {
				System.out.println("에러입니다. 처음부터 다시 결제해주세요.");
			}
			break;
		}
	
		switch(i) {
			case 1 :
				System.out.println("햄버거를 주문하였습니다.");
				chance += 1;
				break;
			case 2 :
				System.out.println("피자를 주문하였습니다.");
				chance += 1;
				break;
			case 3 :
				System.out.println("치킨을 주문하였습니다.");
				chance += 1;
				break;
			case 4 :
				System.out.println("음료수를 주문하였습니다.");
				chance += 1;
				break;

			}		
		}
	}
}
