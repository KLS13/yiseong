import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IoStream2_improve2 {

	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("data.dat")) {
			int dat = in.read();
			System.out.println(dat);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
