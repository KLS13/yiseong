public class Multi {

	public static void main(String[] args) {
		//int[][] apartment = new int[3][2];
		//첫번째 대괄호는 행,  두번째는 열을 표현
		
		//apartment[2][1]=10;
		int[][] apartment = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++)
			System.out.println("apartment"+"["+i+"]"+"["+j+"]"+"="+apartment[i][j]);
		}
	

	}

}
