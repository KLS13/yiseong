import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class IoStream1_improve2 {

	public static void main(String[] args) {
		//try-with-resource ������� ��Ʈ���� �����ϸ� ������ �˾Ƽ� close ��.
		
		try(OutputStream out = new FileOutputStream("data.dat")) {
			out.write(7);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
