
public class oneOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		int b=-a;
		a++;
		++a;
		System.out.println(b);
		System.out.println(-a);
		
		boolean data = true;
		System.out.println(data);
		System.out.println(!data);
		
		int num = 3;  
	            
		++num; //num 변수를 먼저 증가시킴.  선 증가 / 후 처리
		num++; // 처리 먼저 한 뒤에 증가
		--num; //num 변수를 먼저 감소시킴.  선 감소 / 후 처리
		num--; // 처리 먼저 한 뒤에 감소
		
		System.out.println(num);
	}
}
