import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
//��� ���� ��Ʈ���� ��

public class IoStream5 {
	//��½�Ʈ���� ���ͽ�Ʈ���� ���� ���·� ��Ʈ�� ���� !
	public static void main(String[] args) {
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("data.dat"))) {
			out.writeInt(370); // ����Ʈ ������ �ƴ� int�� ���... ���Ͽ��� ����Ʈ�� �ɰ����� ����.
			out.writeDouble(3.14);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
