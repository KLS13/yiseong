interface Printable {
	void print(String s);
}

//람다표현식 : 메소드를 표현하는식 간단하게.

//JAVA 컴파일러(해석) --> JVM(실행)
//--> 컴파일러가 알고있는 사실에 대해서 최대한 작성하지않음
class Lambda1 {

	public static void main(String[] args) {
		Printable prn = (s) -> { System.out.println(s); };
				
		prn.print("안녕!");
	} //익명클래스를 활용하여 일시적으로 객체 생성 성공

}
