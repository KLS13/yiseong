import java.util.Scanner;

public class Jumin {
//�ֹε�Ϲ�ȣ �Ǻ� (2000���� �� ��, �������� �Ǻ� �׸��� ���Ŀ� ���� �ʴ� �Է°��� �߸��� ��ȣ��� ǥ�����ֱ�)
 public static void main(String[] args) {
  
  char gender;
  String Num = "" ;
  
  System.out.println("�ֹι�ȣ�� �Է��ϼ��� (ex 000000-0000000 ) : ");
  Scanner input = new Scanner(System.in);
  Num = input.nextLine();
  gender = Num.charAt(7);
  
  switch(gender) {
  case '1':
  case '3':
   switch(gender) {
   case '1':
    if(Num.charAt(6)!=('-')) {
    	   System.out.println("�߸��� �ֹε�Ϲ�ȣ �Դϴ�.");
    		  }else{
    			  System.out.println("2000��� ���� ��� �����Դϴ�.");
    		  }
    break;
   case '3':
    
    if(Num.charAt(6)!=('-')) {
    	   System.out.println("�߸��� �ֹε�Ϲ�ȣ �Դϴ�.");
    }else{
    	System.out.println("2000��� ���� ��� �����Դϴ�.");
	  }
    break;
   }
   break;
  case '2':
  case '4':
   switch(gender) {
   case '2':
    System.out.println("2000��� ���� ��� �����Դϴ�.");
    if(Num.charAt(6)!=('-')) {
    	   System.out.println("�߸��� �ֹε�Ϲ�ȣ �Դϴ�.");
    }else{
    	System.out.println("2000��� ���� ��� �����Դϴ�.");
	  }
    break;
   case '4':
  
    if(Num.charAt(6)!=('-')) {
    	   System.out.println("�߸��� �ֹε�Ϲ�ȣ �Դϴ�.");
    }else{
    	System.out.println("2000��� ���� ��� �����Դϴ�.");
	  }
    break;
   }
   break;
  default:
   System.out.println("�߸��� �ֹε�Ϲ�ȣ �Դϴ�.");

   break;
   }
 }
}
