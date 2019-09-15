//Rectangle, Triangle, Circle Ŭ������ Shape Ŭ������ ��� ��ӹް� ��.

abstract class Shape { 
	   abstract double draw(); 
	 } // ShapeŬ�������� draw() �޼��尡 abstract�� ����Ǿ��ֱ� ������
       // Shape�� ��ӹ޴� ��� Ŭ������ draw()�޼��带 ������ �����ؾ���.
       // ��, �ؿ� ��� Ŭ������ draw() �޼��带 ������ ��.
	   // �������� ���� �� Ŭ������ ��ü�� �θ� ���������� Shape Ÿ�Կ� �ְ�
       // draw() �޼��带 ȣ���ϰ��� �ϴ� �ǵ���.
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
	 // Ŭ������ �θ�Ŭ������ �ڽ�Ŭ���� ��� ���� �̸��� ������ �ִ� ���,
	 // �θ��� ������������ ��������� ����ϴ� ��� �θ��� ��������� ���ǰ� ��.
	 // �θ��� ������������ �޼��带 ȣ���ϴ��� �θ��� ���������� ����ִ� ��ü�� �ڼ��� ���,
	 // �ڼ��� �޼��尡 ȣ��ȴٴ� ��.
	 // �� �������ε� ��ɡ�
	 public class ShapePrac { 

	   public static void main(String[] args) { 

	     Shape shape[] = new Shape[3];
	     
	     shape[0] = new Rectangle(10, 10); 
	     shape[1] = new Triangle(10, 5); 
	     shape[2] = new Circle(10); 

	     for(int i = 0; i <shape.length; i++){ 
	       System.out.println(shape[i].draw());
	       // �ݺ����� ���鼭 Shape ���� ������ Shape�ȿ� ����ִ� 
	       // �� Ŭ���� ��ü�� draw()�� ȣ����.
	       // �������ε��� �Ͼ���ʰ� ����� �θ� draw()�� abstract ������ draw(){ } �� ���ǵǾ��ִٸ�,
	       // ���������� draw()�� ȣ���Ͽ��� ������ �θ��� draw()�� �����.
	    } 
	 } 
 } 

// �������ε� ������� ���� ���� ��ü�� draw() �޼��尡 ȣ��Ǵ� ��  ���� �ʿ� !!