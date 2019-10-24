import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
//입력 필터 스트림의 예
public class IoStream6 {

	public static void main(String[] args) {
		try(DataInputStream in = new DataInputStream(new FileInputStream("data.dat"))) {
			int num1 = in.readInt();
			double num2 = in.readDouble();
			
			System.out.println(num1);
			System.out.println(num2);
		}
	catch(IOException e) {
		e.printStackTrace();
		}
	}
}
