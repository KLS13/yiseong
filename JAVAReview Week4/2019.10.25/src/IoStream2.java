import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IoStream2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream in = new FileInputStream("data.dat");
		/*
		 * �ش� ������ �������� ������ ���ܹ߻�
		 */
		int dat = in.read(); // �о���� �����ʹ� ��ȯ������ ��ȯ�ȴ�.
		in.close(); //��Ʈ�� ���� �����ϱ� �������� !
		
		System.out.println(dat);
	}

}
