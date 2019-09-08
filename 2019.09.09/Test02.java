import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		int i;
		int sum=0;
		
        while(true) { 
        		
		System.out.print("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		
			if(i==0) { //만약 i가 0을 경우 break;
			System.out.println("종료!" + " " + "숫자의 합은" + " " +  sum);
			break;
			
	     	}else { // 그 외에는 sum에 i 값을 저장
			sum+=i;  
		}
	  }
   }
}
