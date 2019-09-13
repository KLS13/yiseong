package Study;
//상속에 있어서 상속관계를 형성하는 관례!


	//부모클래스와 자식클래스의 관계는
	//IS-A 관계여야 바람직   ex) 자식클래스 is a 부모클래스 ,  BabyCat is a Cat
	
	class Pokemon {
		//protected : 상속관계에서도 접근 가능
		//private : 클래스 내에서만 접속가능
		protected String name;
		public String prop;
		
		//생성자 또는 초기화메서드
		
		public Pokemon(String name, String prop){
			this.name = name;
			this.prop = prop;
			
		}
		
	}
	
	class Pikachu extends Pokemon{
		public Pikachu(String name, String prop){
			super(name,prop);
		}
		public void attack() {
			// private은 클래스 내에서만 접근 가능!
			// 그런게 여기는 자식클래스 일뿐, 클래스 내부는 아님.
			System.out.println(this.name + " " + this.prop + "공격!!!!");
		}
	}
	
		public class Controller2 {
			
	public static void main(String[] args) {
		Pikachu pika1 = new Pikachu("피카츄", "전기");
		Pikachu pika2 = new Pikachu("이상해씨", "채찍");
		pika1.attack();
		pika2.attack();

	}


}