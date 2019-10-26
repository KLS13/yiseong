import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class StringStream4 {

	public static void main(String[] args) {
		String ks = "���ο� �־ ���� �� �ʿ��� ���� �ƴϴ�.";
		String es = "Life is long if you know how to use it.";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))) {
			bw.write(ks, 0, ks.length());
			//ks�� 0�� �ε������� ks�� ���̸�ŭ ����Ѵ�.
			//"���ο� �־ ���� �� �ʿ��Ѱ��� �ƴϴ�."
			bw.newLine(); // ������ �ǹ��ϴ� �޼ҵ�!
			//newLine �޼ҵ尡 �����ϴ� ����
			//OS(������, ������, ��OS...) ���� ������ ǥ���ϴ� ���ڰ� ���ݾ� �ٸ��⶧��.
			//�ڹٰ� �˾Ƽ� ���� ���ڸ� ǥ���ϰԲ� ���� ��.
			bw.write(es, 0, es.length());
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
