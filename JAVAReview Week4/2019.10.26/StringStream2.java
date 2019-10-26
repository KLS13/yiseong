import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class StringStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" ���� ���� : ");
		String src = sc.nextLine();
		
		try(Reader in = new FileReader(src)) {
			int ch;
			
			while(true) {
				ch = in.read(); //�����ڵ尡 ��ȯ�ȴ�
				if(ch==-1) // ���� �����Ͱ� ������ -1 ��ȯ
					break;
				System.out.print((char)ch); // ����ũ���� ���ڷ� ��ȯ�Ͽ� ���
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
