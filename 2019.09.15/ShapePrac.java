//Rectangle, Triangle, Circle 클래스는 Shape 클래스를 모두 상속받게 됨.

abstract class Shape { 
	   abstract double draw(); 
	 } // Shape클래스에는 draw() 메서드가 abstract로 선언되어있기 때문에
       // Shape를 상속받는 모든 클래스는 draw()메서드를 무조건 정의해야함.
       // 즉, 밑에 모든 클래스는 draw() 메서드를 가지게 됨.
	   // 다형성을 통해 세 클래스의 객체는 부모 참조변수인 Shape 타입에 넣고
       // draw() 메서드를 호출하고자 하는 의도임.
	 class Rectangle extends Shape { 
	   int w = 0; 
	   int h = 0; 

	   public Rectangle(int w, int h){ 
	     this.w = w; 
	     this.h = h; 

	  } 
	  public double draw() { 
	    return w * h; 
	 } 
 } 
	 class Triangle extends Shape { 
	   int w = 0; 
	   int h = 0; 

	   public Triangle(int w, int h){ 
	     this.w = w; 
	     this.h = h; 
	  } 
	  public double draw() { 
	    return w * h / 2; 
	 } 
} 

	 class Circle extends Shape { 

	   int r = 0; 
	   double area = 0.0; 

	   public Circle(int r){ 
	     this.r = r; 
	  } 

	  public double draw() { 
	    return r * r * Math.PI; 
	 } 
} 
	 // 클래스에 부모클래스와 자식클래스 모두 같은 이름의 변수가 있는 경우,
	 // 부모의 참조변수에서 멤버변수를 사용하는 경우 부모의 멤버변수가 사용되게 됨.
	 // 부모의 참조변수에서 메서드를 호출하더라도 부모의 참조변수에 담겨있는 객체가 자손인 경우,
	 // 자손의 메서드가 호출된다는 점.
	 // ★ 동적바인딩 기능★
	 public class ShapePrac { 

	   public static void main(String[] args) { 

	     Shape shape[] = new Shape[3];
	     
	     shape[0] = new Rectangle(10, 10); 
	     shape[1] = new Triangle(10, 5); 
	     shape[2] = new Circle(10); 

	     for(int i = 0; i <shape.length; i++){ 
	       System.out.println(shape[i].draw());
	       // 반복문이 돌면서 Shape 참조 변수인 Shape안에 들어있는 
	       // 세 클래스 객체의 draw()를 호출함.
	       // 동적바인딩이 일어나지않고 현재는 부모 draw()가 abstract 이지만 draw(){ } 가 정의되어있다면,
	       // 참조변수로 draw()를 호출하였기 때문에 부모의 draw()가 실행됨.
	    } 
	 } 
 } 

// 동적바인딩 기능으로 인해 실제 객체의 draw() 메서드가 호출되는 점  이해 필요 !!