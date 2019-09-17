class INum{
	private int num;
	public INum(int num) {
		this.num = num;
	}
	//재정의하는것 가능
	// -> '같다'라는 개념 자체를 사용자가 정할 수 있음.
	public boolean equals(Object obj) {
		if(this.num == ((INum)obj).num)
			return true;
		else
			return false;
	} 
}
public class ObjectEquals {

	public static void main(String[] args) {
	
		INum num1 = new INum(10);
		INum num2 = new INum(12);
		INum num3 = new INum(10);
		
		//등가비교연산자 : 메모리 주소 비교
		if(num1 == num3)
			System.out.println("동일");
		else
			System.out.println("다름");
		
		//Object equals는 값을 비교하는게 아니다 !
		//메모리 주소를 비교함.
		
		if(num1.equals(num3))
			System.out.println("동일");
		else
			System.out.println("다름");
		
		

	}

}
