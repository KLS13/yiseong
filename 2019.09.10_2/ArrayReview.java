import java.util.*;
public class ArrayReview {

	public static void main(String[] args) {	
	//	int [] arr = {1,2,3,4,5}; // ����� ���ÿ� �ʱ�ȭ
	//	double [] arr1 = new double[5]; 
		
		//�迭�� ��ҿ� �����ϴ� ��� : �迭��[��ҹ�ȣ]
		// -> �ڹٴ� ���ڸ� 0���� ����.
		
		//�迭�� ���� ��Ҵ� �ϳ��� �����μ� ���.
		int[] arr = new int[5];
		int sum = 0;
		int max, min, i;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�Է� : ");
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
		
		
