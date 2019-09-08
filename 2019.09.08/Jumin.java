import java.util.Scanner;

public class Jumin {
//주민등록번호 판별 (2000년대생 전 후, 남성여성 판별 그리고 형식에 맞지 않는 입력값은 잘못된 번호라고 표시해주기)
 public static void main(String[] args) {
  
  char gender;
  String Num = "" ;
  
  System.out.println("주민번호를 입력하세요 (ex 000000-0000000 ) : ");
  Scanner input = new Scanner(System.in);
  Num = input.nextLine();
  gender = Num.charAt(7);
  
  switch(gender) {
  case '1':
  case '3':
   switch(gender) {
   case '1':
    if(Num.charAt(6)!=('-')) {
    	   System.out.println("잘못된 주민등록번호 입니다.");
    		  }else{
    			  System.out.println("2000년대 이전 출생 남성입니다.");
    		  }
    break;
   case '3':
    
    if(Num.charAt(6)!=('-')) {
    	   System.out.println("잘못된 주민등록번호 입니다.");
    }else{
    	System.out.println("2000년대 이후 출생 남성입니다.");
	  }
    break;
   }
   break;
  case '2':
  case '4':
   switch(gender) {
   case '2':
    System.out.println("2000년대 이전 출생 여성입니다.");
    if(Num.charAt(6)!=('-')) {
    	   System.out.println("잘못된 주민등록번호 입니다.");
    }else{
    	System.out.println("2000년대 이전 출생 여성입니다.");
	  }
    break;
   case '4':
  
    if(Num.charAt(6)!=('-')) {
    	   System.out.println("잘못된 주민등록번호 입니다.");
    }else{
    	System.out.println("2000년대 이후 출생 남성입니다.");
	  }
    break;
   }
   break;
  default:
   System.out.println("잘못된 주민등록번호 입니다.");

   break;
   }
 }
}
