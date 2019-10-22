package com.koreait.test;

class Product<T1, T2>{
	private T1 category;
	private T2 model;
	
	public void setCategory(T1 category) {
		this.category = category;
	}
	public void setModel(T2 model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return category + ", " + model;
	}
	/*	public String toString() {
	StringBuffer sb = new StringBuffer();
	sb.append("1 : ").append(category).append("\n");
	sb.append("2 : " ).append(model);
	return sb.toString(); // string 타입으로 리턴을 해줘야함.
}
*/
}

class Elec { 
	@Override
	public String toString() {
		return "가전제품";
	}
}
class TV {
private String name;
	
	public TV(String name) {
		this.name = name;
	}
		@Override
		public String toString() {
			return this.name;
		}
	}


class Life { }
class Cup { }
public class Test02 {

	public static void main(String[] args) {
		
		Product<Elec, TV> product1 = new Product<>();
		Product<Life, Cup> product2 = new Product<>();
		
		//Product1.setCategory(new Elec());
		product1.setModel(new TV("LG"));
		product1.setCategory(new Elec());
		
		System.out.println(product1);
	}
}

/*
package com.koreait.test;

class Product<T1, T2> {
	
	// Field
	private T1 category;
	private T2 model;
	
	// Method
	public T1 getCategory() {
		return category;
	}
	public void setCategory(T1 category) {
		this.category = category;
	}
	public T2 getModel() {
		return model;
	}
	public void setModel(T2 model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return category + ", " + model + " TV";
	}
	
}

class Elec {
	
	// Method
	@Override
	public String toString() {
		return "전자제품";
	}
	
}

class TV {
	
	// Field
	private String model;
	
	// Constructor
	public TV(String model) {
		this.model = model;
	}
	
	// Method
	@Override
	public String toString() {
		return model;
	}
	
}

public class Test02 {

	public static void main(String[] args) {

		Product<Elec, TV> product1 = new Product<>();
		// Product<Life, Cup> procuct2 = new Product<>();
		
		product1.setCategory(new Elec());
		product1.setModel(new TV("LG"));
		
		System.out.println(product1);	// 전자제품, LG TV
		
	}

}

*/