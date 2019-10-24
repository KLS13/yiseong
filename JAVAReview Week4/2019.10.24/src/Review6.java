import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student {
	private String name;
	private int number;
	
	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return "이름 : " + name;
	}
	@Override
	public int hashCode() {
		return name.charAt(0);
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj != null && obj instanceof Student) {
			String StrName = ((Student)obj).name;
			return name.equals(StrName);
		}else {
			return false;
		}
	}

}
public class Review6 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student("강이성",1234));
		set.add(new Student("자바맨",5678));
		set.add(new Student("강이성",5678));
		set.add(new Student("자바맨",5678));
		
		Iterator<Student> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		
		
		
		
	}

}
