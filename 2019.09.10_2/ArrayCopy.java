import java.util.*;

public class ArrayCopy {

	public static void main(String[] args) {
	
		int[] a = {1,2,3,4,5,6};
		int[] b = {0,0,0,0,0,0,0};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.arraycopy(a,2,b,3,4);
		System.out.println(Arrays.toString(b));

		//1.세번째에 있는 곳에 첫번째 있는 곳의 내용을 복사
		//2. 2의 뜻: a의 2번째칸부터 복사
        //3. 3의 뜻: b의 3번칸부터 복사를 당함
		//4. 4의 뜻: 4개의 값을 복사한다.
	}

}
