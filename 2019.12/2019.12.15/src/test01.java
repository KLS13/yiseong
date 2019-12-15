/*
- 공연은 하루에 한 번 있다.
- 좌석은 S석, A석, B석으로 나뉘며, 각각 10개의 좌석이 있다.
- 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다.
- 예약은 한 자리만 가능하고, 좌석 타입, 예약자 이름, 좌석 번호를 순서대로 입력받아 예약한다.
- 조회는 모든 좌석을 출력한다.
- 취소는 예약자의 이름을 입력받아 취소한다.
- 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메시지를 출력하고 사용자가 다시 시도하도록 한다.
 */


import java.util.Scanner;

class Concert{
   private String S[];
   private String A[];
   private String B[];
   private Scanner sc;
   Concert() {
      sc = new Scanner(System.in);
      S = new String[10];
      A = new String[10];
      B = new String[10];
      for(int i=0; i<S.length; i++) {
         S[i] = "___";
         A[i] = "___";
         B[i] = "___";
      }
   }
   public static void printSeat(String seat[]) { //좌석 한줄 출력 메소드
      for(int i=0; i<seat.length; i++) {
         System.out.print(" "+seat[i]+" " );
      }
      System.out.println();
   }
   public void allPrint() { //모든 좌석 출력 메소드
      System.out.print("S>>");
      Concert.printSeat(S);
      System.out.print("A>>");
      Concert.printSeat(A);
      System.out.print("B>>");
      Concert.printSeat(B);
      System.out.println("<<<조회를 완료하였습니다.>>>");
   }
   public void choiceSeat() { //좌석 선택(S, A, B) 메소드
      while(true) {
         System.out.print("좌석구분 S(1), A(2), B(3)>>");
         int select = sc.nextInt();
         switch(select) {
         case 1: 
            System.out.print("S>>");
            printSeat(S);
            inputSeat(S);
            return;
         case 2:
            System.out.print("A>>");
            printSeat(A);
            inputSeat(A);
            return;
         case 3: 
            System.out.print("B>>");
            printSeat(B);
            inputSeat(B);
            return;
         default:
            System.out.println("다시 입력해 주세요.");
         }
      }
   }
   public void inputSeat(String seat[]) { //좌석에 이름값 넣는 메소드
      System.out.print("이름>>");
      String name = sc.next();
      while(true) {
         System.out.print("번호>>");
         int num = sc.nextInt();
         num--;
         if(seat[num].equals("___")) {
            seat[num] = name;
            break;
         }
         else {
            System.out.println("다른 좌석을 선택해 주세요.");
         }
      }
   }  
   public void d_choiceSeat() {
      while(true) {
         System.out.print("좌석 S:1, A:2, B:3>>");
         int select = sc.nextInt();
         switch(select) {
         case 1: 
            System.out.print("S>>");
            printSeat(S);
            delete(S);
            return;
         case 2:
            System.out.print("A>>");
            printSeat(A);
            delete(A);
            return;
         case 3: 
            System.out.print("B>>");
            printSeat(B);
            delete(B);
            return;
         default:
            System.out.println("다시 입력해 주세요.");
         }
      }
   }
   public void delete(String seat[]) {
      System.out.print("이름>>");
      String name = sc.next();
      for(int i=0; i<seat.length; i++) {
         if(name.equals(seat[i])) {
            seat[i] = "___";
            break;
         }
      }
   }
}
public class test01 {
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("명품콘서트홀 예약 시스템입니다.");
      Concert concert = new Concert();
      while(true) {
         System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
         int select = sc.nextInt();
         switch(select) {
         case 1:
            concert.choiceSeat();
            break;
         case 2:
            concert.allPrint();
            break;
         case 3:
            concert.d_choiceSeat();
            break;
         case 4:
            sc.close();
            return;
         default :
            System.out.println("다시 입력해 주세요.");
         }
      }
   }

}