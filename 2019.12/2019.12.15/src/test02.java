/*
- int 타입의 a, b 필드: 2개의 피연산자
- void setValue(itn a, int b): 피연사 값을 객체 내에 저장한다.
- int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
 */
import java.util.Scanner;

class Add {
   private int a;
   private int b;
   public void setValue(int a, int b) {
      this.a = a;
      this.b = b;
   }
   public int calculate() {
      return a+b;
   }
}
class Sub {
   private int a;
   private int b;
   public void setValue(int a, int b) {
      this.a = a;
      this.b = b;
   }
   public int calculate() {
      return a-b;
   }
}
class Mul {
   private int a;
   private int b;
   public void setValue(int a, int b) {
      this.a = a;
      this.b = b;
   }
   public int calculate() {
      return a*b;
   }
}
class Div {
   private int a;
   private int b;
   public void setValue(int a, int b) {
      this.a = a;
      this.b = b;
   }
   public int calculate() {
      return a/b;
   }
}

public class test02 {

   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      int result=0;
      System.out.print("두 정수와 연산자를 입력하시오 >> ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      char c = sc.next().charAt(0);
      switch(c) {
      case '+' : 
         Add add = new Add();
         add.setValue(a, b);
         result = add.calculate();
         break;
      case '-' :
         Sub sub = new Sub();
         sub.setValue(a, b);
         result = sub.calculate();
         break;
      case '*' :
         Mul mul = new Mul();
         mul.setValue(a, b);
         result = mul.calculate();
         break;
      case '/' :
         Div div = new Div();
         div.setValue(a, b);
         result = div.calculate();
         break;
      }
      System.out.println(result);
      sc.close();
   }

}