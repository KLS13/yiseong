import java.util.Random; //무작위로 값을 만들어내는 내부적인 알고리즘을 가지고 있음.

public class RandomClass {

	public static void main(String[] args) {
	
		System.out.println(System.currentTimeMillis());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		Random ranNum = new Random(3);
		for(int i =0 ; i<5 ; i++) {
		System.out.println(ranNum.nextInt(10)); //10 미만의 랜덤값을 내놔라 !
		}
		//종자값 3을 기반으로 해서 랜덤알고리즘을 통해 값을 뽑아냄.
		// 그리고 뽑아낸 값은 int형 값이다.
		//종자값은 알고리즘에 의해 값을 뽑아내므로 일정한 패턴을 지닌다.
		//따라서 진정한 의미에서의 랜덤이라고 하기에는 조금 아쉽다 
		
		//반면, 종자값을 전달해주지 않으면 진정한 랜덤값을 뽑아낼수잇음
		//종자값을 전달해주지않으면 알아서 종자값을 넣는다
		//--> 이때의 종자값은 '현재 시간(ms)' 에 대한 정보입니다.
		
		
		
	}

}
