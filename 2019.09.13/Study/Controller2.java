package Study;
//��ӿ� �־ ��Ӱ��踦 �����ϴ� ����!


	//�θ�Ŭ������ �ڽ�Ŭ������ �����
	//IS-A ���迩�� �ٶ���   ex) �ڽ�Ŭ���� is a �θ�Ŭ���� ,  BabyCat is a Cat
	
	class Pokemon {
		//protected : ��Ӱ��迡���� ���� ����
		//private : Ŭ���� �������� ���Ӱ���
		protected String name;
		public String prop;
		
		//������ �Ǵ� �ʱ�ȭ�޼���
		
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
			// private�� Ŭ���� �������� ���� ����!
			// �׷��� ����� �ڽ�Ŭ���� �ϻ�, Ŭ���� ���δ� �ƴ�.
			System.out.println(this.name + " " + this.prop + "����!!!!");
		}
	}
	
		public class Controller2 {
			
	public static void main(String[] args) {
		Pikachu pika1 = new Pikachu("��ī��", "����");
		Pikachu pika2 = new Pikachu("�̻��ؾ�", "ä��");
		pika1.attack();
		pika2.attack();

	}


}