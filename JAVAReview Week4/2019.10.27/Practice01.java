//Point 클래스와 Rectangle 클래스 내용비교
//equals 메소드를 각각 삽입 --> 정의한 equals 메소드의 확인을 위한 main 정의
class Point {
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		
		if(xPos == p.xPos && yPos == p.yPos)
			return true;
		else
			return false;
	}
}

class Rectangle {
	private Point upperLeft; // 좌측 상단
	private Point lowerRight; // 우측 하단 
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	

@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Rectangle r = (Rectangle)obj;
		
		if(upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight))
			return true;
		else
			return false;
	}
}

public class Practice01 {

	public static void main(String[] args) {
		
		Point p1 = new Point(3,4);
		Point p2 = new Point(3,4);
		
		Rectangle r1 = new Rectangle(1,2,8,9);
		Rectangle r2 = new Rectangle(1,2,8,9);
		
		if(p1.equals(p2))
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		if(r1.equals(r2))
			System.out.println("같다");
		else
			System.out.println("다르다");

	}

}
