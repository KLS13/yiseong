class Person {
	private String no; 
	private String name;
	private int[] scores;
	private double average;
	private char grade;
	public final static int COURSE_COUNT = 2;	// ���� ��
										// ������, ��𼭵� Person.COURSE_COUNT �� Ȯ�� ����!
	public Person(String no, String name) {
		this.no = no;
		this.name = name;
	}
	public void setScore(int kor, int eng) {
		scores[0] = kor;
		scores[1] = eng;
		setAverage();
		setGrade();
	}
	public void setAverage() {
		int sum = 0;
		for(int i=0; i<COURSE_COUNT; i++) {
			sum += scores[i];
		}
		average = (double)sum / COURSE_COUNT;
	}
	
	public void setGrade() {
		if(average >=90){
			grade = 'A';
		}else if(average >=80){
			grade = 'B';
		}else if(average >=70){
			grade = 'C';
		}else if(average >=60){
			grade = 'D';
		}else {
			grade = 'F';
		}
	}
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			Person other = (Person)obj;
			return no.equals(other.no) && name.equals(other.name);
		}else{
			return false;
		}
	}
	
	
}

public class Test03 {

	public static void main(String[] args) {
		Person myStu1 = new Person("1301243","�ڹ�");
		Person myStu2 = new Person("1301243","�ڹ�");
		
		if(myStu1.equals(myStu2)){
			System.out.println("������");
		}else {
			System.out.println("�ٸ�");
		}
	}

}
