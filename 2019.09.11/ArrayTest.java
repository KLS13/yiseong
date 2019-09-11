public class ArrayTest {

	public static void main(String[] args) {
		int[][] arr = new int[3][9];
		int i,j;
		int k=3;
		
		
		for(i=0;i<3;i++) {
			for(j=0;j<9;j++) {
				arr[i][j]=k*(j+1);
				
			}
			k+=3;
		}
	
		for(i=0;i<3;i++) {
			for(j=0;j<9;j++) {
				System.out.print(arr[i][j]);
				System.out.println("");
			}

		}
	}
}
