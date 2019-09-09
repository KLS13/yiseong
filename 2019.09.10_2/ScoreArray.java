public class ScoreArray {

	public static void main(String[] args) {
		
		int[] score = {88, 90, 74, 62, 100};
	
		int sum = 0;
		int i ;
		for(i=0; i<score.length; i++) {
			sum += score[i];
			
		}
		System.out.printf("Æò±ÕÀº %d" , sum/score.length);
	}

}
