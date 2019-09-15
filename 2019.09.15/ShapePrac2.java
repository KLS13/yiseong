import java.util.*;

interface Moveable
{
	void move();
}
class Shape2 implements Moveable
{
	protected int x, y;
	public void draw()
	{
		System.out.print("Shape Draw\n");
	}
	public String toString()
	{
		return "±‚¡ÿ¡° : " + "("+x+", "+y+")\n";
	}
	public void move()	{
		
	}
}
class Rectangle2 extends Shape2 implements Moveable
{
	int width, height;
	public Rectangle2(int width_1, int height_1)
	{
		width = width_1;
		height = height_1;
	}
	public void draw()	{	System.out.println("Rectangle Draw");	}	
	public void move()
	{
		Random rand = new Random();
		x = rand.nextInt(100);
		y = rand.nextInt(100);
	}
	public String toString()
	{
		return super.toString()
				+ "width = " +width+"\nheight = "+height;
	}
}

class Circle2 extends Shape2 implements Moveable
{
	int radius;
	public Circle2(int radius_1)
	{
		radius = radius_1;
	}
	public void draw()	{	System.out.println("Circle Draw");	}	
	public void move()
	{
		Random rand = new Random();
		x = rand.nextInt(100);
		y = rand.nextInt(100);
	}
	public String toString()
	{
		return super.toString()
				+ "radius = " + radius;
	}
}

public class ShapePrac2 {
	public static void main(String[] args) {
		Moveable mv[] = new Shape2[5];
		
		mv[0] = new Rectangle2(1, 3);
		mv[1] = new Circle2(3);
		mv[0].move();
		System.out.println("======= Rectangle ========");
		System.out.println(mv[0].toString());
		mv[1].move();
		System.out.println("======= Circle ===========");
		System.out.println(mv[1].toString());
	}
}