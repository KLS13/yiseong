class Student implements Cloneable{
    String name;
    Student(String name){
        this.name = name;
    }
    public Object clone() {
    	Object obj = null;
    	try{
    		obj = super.clone();
    	}catch(CloneNotSupportedException e){
    		e.printStackTrace();
    	}
        return obj;
    }
}

public class Test01 {

    public static void main(String[] args) {
        Student s1 = new Student("Java");
        
        Student s2 = (Student)s1; 
        // Student s2 = (Student)s1.clone();
		System.out.println(s1.name);
		System.out.println(s2.name);
    }
}