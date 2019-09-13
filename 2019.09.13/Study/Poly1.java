package Study;
// 다형성 : 여러가지 형태를 가질 수 있는 성질

class Calculator{
	
}

class EngCal extends Calculator{ }
class ProCal extends Calculator{ }

public class Poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal1 = new Calculator();
		Calculator cal2 = new EngCal();
		Calculator cal3 = new ProCal();
	}

}
