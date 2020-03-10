package lambda;

public class StringTest {

	public static void main(String[] args) {
		
		// ¿ø·¡ 
		StringImpl impl = new StringImpl();
		impl.makeString("Hello", "Java");

		
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("Hi", "Java");
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
								
			}
		};
		concat2.makeString("Hi", "Java8");
	}

}
