
public class LogicOP {

	public static void main(String[] args) {
		
		System.out.println(3>2 && true); // 비교연산이 논리연산보다 우선순위
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true && false || false); // && 연산이 || 순위보다 높다
		System.out.println(false || 3>2);
		System.out.println(true || false);
		System.out.println(false || false);
		
		
		System.out.println(false ^ true); //
		System.out.println(true ^ true); //

	}
}
