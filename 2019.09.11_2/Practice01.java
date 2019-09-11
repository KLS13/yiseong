class Printer{
	String str;

void SetString(String input) {
	str = input;
	}

void ShowString() {
	System.out.println(str);
}
}
public class Practice01 {

	public static void main(String[] args) {
		Printer pnt = new Printer();
		pnt.SetString("hello");
		pnt.ShowString();
		pnt.SetString("kk");
		pnt.ShowString();
	
	}

}
