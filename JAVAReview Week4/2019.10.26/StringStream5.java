import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class StringStream5 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("String.txt"))) {
			String str;
			
			while(true) {
				str = br.readLine(); // ���� ������ �о���δ�.
				if(str == null) // ���� ���� ���� �� null ��ȯ��.
					break;
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
