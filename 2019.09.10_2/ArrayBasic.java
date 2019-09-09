import java.lang.reflect.Array;
import java.util.*;

public class ArrayBasic {

	public static void main(String[] args) {
		
		// int형 데이터 100개 관리.
		// 배열생성
		int[] arri; // arri 라는 이름의 배열생성
		double[] arrd;
		//arri 와 arrd 는 참조변수
        // new 라는 연산자를 사용하면 배열만들수있음
		
		arri = new int[5]; // arri 는 5칸
		int[] a = new int[3];
		// a 라는 배열은 int형 데이터 3칸
		a[0]=3;
		a[1]=6;
		a[2]=9;
		for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	   }
		
		a[0]=a[1];
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
	   }

		int[] bbb = {1,3,5,7,9};
		//알아서 다섯 칸짜리 배열이 만들어지고, 1 3 5 7 9 가 알아서 차례차례 들어간다.
		System.out.println("---------------------");
		int[] ccc = new int[] {1,3,5,7,9};
		for(int i=0; i<ccc.length; i++) {
			System.out.println(ccc[i]);
	   }
		System.out.println("배열의 길이는" + ccc.length);
		
	}
}
