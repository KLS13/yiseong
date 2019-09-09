import java.util.*;
public class ArrayReview {

	public static void main(String[] args) {	
	//	int [] arr = {1,2,3,4,5}; // 선언과 동시에 초기화
	//	double [] arr1 = new double[5]; 
		
		//배열의 요소에 접근하는 방법 : 배열명[요소번호]
		// -> 자바는 숫자를 0부터 센다.
		
		//배열의 각각 요소는 하나의 변수로서 기능.
		int[] arr = new int[5];
		int sum = 0;
		int max, min, i;
		Scanner input = new Scanner(System.in);
		
		System.out.print("입력 : ");
		for(i=0; i<5; i++) {
			
			
			arr[i]= input.nextInt();
			
			min = arr[0];
			max = arr[0];
			sum = arr[0];
			
			for(i=1; i<5 ; i++) {
				sum += arr[i];
				
				if(max < arr[i]) {max = arr[i];}
				if(min > arr[i]) {min = arr[i];}
				
			}
			System.out.println(min + max );
		}
	}
}
		
		
