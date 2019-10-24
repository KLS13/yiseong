import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class IoStream1_improve2 {

	public static void main(String[] args) {
		//try-with-resource 기반으로 스트림을 연결하면 끝날때 알아서 close 됨.
		
		try(OutputStream out = new FileOutputStream("data.dat")) {
			out.write(7);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
