import java.io.Writer; //����Ʈ������� ������ �ƿ�ǲ��Ʈ���� ����
import java.io.FileWriter; //���� �ƿ�ǲ��Ʈ���� ����
import java.io.IOException; 
// ���� ��Ʈ���� ���� ���� : �� ȯ�濡 �´� ���ڵ� ����� �����ϱ� ���ؼ�
// ���ڵ� : ���̳ʸ� �����͸� ǥ�� ��Ŀ� ���߾� ���ڷ� ��ȯ���ִ� ��!
// ���ڵ� : ���ڵ��� �ݴ�~
class StringStream1 {

	public static void main(String[] args) {
		try(Writer out = new FileWriter("data.txt")) {
			//Writer�� OutputStream�� ���� 
			//FileWriter�� FileOutputSteam�� �����ȴ�.
			out.write('A'); //A ����
			out.write('��'); //�� ����
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
