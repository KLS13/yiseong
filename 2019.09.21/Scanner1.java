import java.io.FileInputStream;
import java.util.Scanner;

// system.in �� �ƴϴ��� �Է��� ������ �ִ� ����� ����.
public class Scanner1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("src/Sample.txt");
			Scanner s = new Scanner( fis );
			while ( s.hasNext()) {  //hasNext�� ?  �о���� ������ ���� ��� true�� ��ȯ�Ѵ�
				System.out.println( s.nextLine());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
