import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStream1_improve1 {

	public static void main(String[] args) throws IOException {
		OutputStream out = null;
		
		try {
			//�� ������ ��� ���ܹ߻� ���ɼ��� �ֵ�.
			// --> ������ �ɼ��� �ְ� �ȵɼ��� �ִ�.
			out = new FileOutputStream("data.dat");
			out.write(7);
		}finally { // try ���� �ݵ�� ����Ǵ� �κ��̴�.
			if(out !=null)
				out.close();
			//��Ʈ���� �� �����Ǿ����� close ���ְ�, �ƴϸ� ����~
			
		}

	}

}
