
public class Rect {
	int width;
	int height;
	
	Rect(int width, int height){
		this.width = width;
		this.height = height; 
	}
	
	void setWidth(int width) {
		this.width = width;
	}
	void setHeight(int height) {
		this.height = height;
	}
	void output() {
		System.out.println("�ʺ� : " + width);
		System.out.println("���� : " + height);
	}
	}
