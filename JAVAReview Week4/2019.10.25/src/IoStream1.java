import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class IoStream1 {

	public static void main(String[] args) throws IOException {
		
		OutputStream out = new FileOutputStream("data.dat");
		/*
		 * � ������ ������� ��½�Ʈ���� ���� �� ������ �ϰڴ�.
		 * �̶�, ��� ������ �����ϸ� �����ϴ� ���Ͽ�, ���� ���������� ������ ���� ����� ������.
		 */
		out.write(7);
		//�⺻������ �����ʹ� ����Ʈ ������� ��µȴ�.
		out.close();
		//��Ʈ�� ���� �� ������ ������, (�ݵ��) �ݾ��־�� �Ѵ�.

	}

}
