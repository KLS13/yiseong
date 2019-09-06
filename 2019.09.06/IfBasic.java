public class IfBasic {

	public static void main(String[] args) {
		// 가장 기본적인 형태의 if문
		
		/* if(조건( 식 또는 값)) {
		  실행문장
		  system.out.println("여기는 if의 바디!")
		  }
		  조건의 조건 : 참 또는 거짓으로 데이터가 나옴.
		  */
		int a = 1;
		int b = 2;
		int num = 3;
		int age = 16;
		  if(a > 0) {
			  //if문의 몸 안에 있는 문장은 조건이 참일때만 수행
		  System.out.println("여기는 if의 바디!");
		  }
		  
		  if(!false) {
			  System.out.println("여기는 if의 바디!");
		  }
		  
		  System.out.println("여기는 if의 밖!");
		    
		  
		  // if - else
		  if(b==1) {
			  System.out.println("참");
		  }
		  else { 
			  System.out.println("거짓");
			  
		  }
		  
		 
		  
		  if(age < 20) {
			  System.out.println("750원");
		  } else {
			  System.out.println("1250원");
		  }
		System.out.println(" if문 끝났습니다. ");
		
		// if - if else
		
		if(num==0) {
			System.out.println("참을 발견");
		} else if(num==1) {
			System.out.println("참을 발견");
		} else if(num==2) {
			System.out.println("참을 발견");
		}
			System.out.println("num은 3입니다.");
		}
		
	}

	


