/*
- ������ �Ϸ翡 �� �� �ִ�.
- �¼��� S��, A��, B������ ������, ���� 10���� �¼��� �ִ�.
- ���� �ý����� �޴��� "����", "��ȸ", "���", "������"�� �ִ�.
- ������ �� �ڸ��� �����ϰ�, �¼� Ÿ��, ������ �̸�, �¼� ��ȣ�� ������� �Է¹޾� �����Ѵ�.
- ��ȸ�� ��� �¼��� ����Ѵ�.
- ��Ҵ� �������� �̸��� �Է¹޾� ����Ѵ�.
- ���� �̸�, ���� ��ȣ, ���� �޴�, �߸��� ��� � ���ؼ� ���� �޽����� ����ϰ� ����ڰ� �ٽ� �õ��ϵ��� �Ѵ�.
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
   public static void printSeat(String seat[]) { //�¼� ���� ��� �޼ҵ�
      for(int i=0; i<seat.length; i++) {
         System.out.print(" "+seat[i]+" " );
      }
      System.out.println();
   }
   public void allPrint() { //��� �¼� ��� �޼ҵ�
      System.out.print("S>>");
      Concert.printSeat(S);
      System.out.print("A>>");
      Concert.printSeat(A);
      System.out.print("B>>");
      Concert.printSeat(B);
      System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
   }
   public void choiceSeat() { //�¼� ����(S, A, B) �޼ҵ�
      while(true) {
         System.out.print("�¼����� S(1), A(2), B(3)>>");
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
            System.out.println("�ٽ� �Է��� �ּ���.");
         }
      }
   }
   public void inputSeat(String seat[]) { //�¼��� �̸��� �ִ� �޼ҵ�
      System.out.print("�̸�>>");
      String name = sc.next();
      while(true) {
         System.out.print("��ȣ>>");
         int num = sc.nextInt();
         num--;
         if(seat[num].equals("___")) {
            seat[num] = name;
            break;
         }
         else {
            System.out.println("�ٸ� �¼��� ������ �ּ���.");
         }
      }
   }  
   public void d_choiceSeat() {
      while(true) {
         System.out.print("�¼� S:1, A:2, B:3>>");
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
            System.out.println("�ٽ� �Է��� �ּ���.");
         }
      }
   }
   public void delete(String seat[]) {
      System.out.print("�̸�>>");
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
      System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
      Concert concert = new Concert();
      while(true) {
         System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
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
            System.out.println("�ٽ� �Է��� �ּ���.");
         }
      }
   }

}