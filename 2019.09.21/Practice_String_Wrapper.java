//String scores = "100,11,35,41"
//위와같이 점수들이 문자열 형태로 주어졌을때, 주어진 점수들의 총점과 평균을 구하는 작성
//문자열을 분리시킨다음,  문ㅇ자열을 숫자로 변환
//총점과 평균

public class Practice_String_Wrapper {

	public static void main(String[] args) {

		String scores = "100,11,35,41";
		String[] arScore = scores.split(",");
		//문자열 분리 split!
		
		
		int total = 0;
		double avg = 0.0;
		//총점 및 평균
		
		for(int i=0; i<arScore.length; i++) {
			total += Integer.parseInt(arScore[i]);
			
		}
		avg = (double)total / arScore.length;
		//명시적 형 변환,  소수점까지 챙겨서 평균을 구하기.
		
		System.out.println(total);
		System.out.println(avg);
	
	
		
	}


}