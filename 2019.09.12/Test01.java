class Rectangle{
	int i,j;
	Rectangle(int i, int j){
		this.i=i;
		this.j=j;
	}
	void ShowAreaInfo() {
		System.out.println("¸éÀû" + i*j);
	}
}

class Square extends Rectangle{
	Square(int k){
		super(k,k);
	}
}

public class Test01 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(4,3);
		rec.ShowAreaInfo();
		
		Square sqr = new Square(7);
		sqr.ShowAreaInfo();
		

	}

}
