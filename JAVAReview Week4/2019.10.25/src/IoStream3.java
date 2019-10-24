
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
//����Ʈ ����� ���� ���α׷�
public class IoStream3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ���� : ");
		String src = sc.nextLine();		
		
		System.out.print("�纻�̸� : ");
		String dst = sc.nextLine();
		long start = System.currentTimeMillis();
		try(InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst)){
					
					int data;
					while(true) {
						data = in.read();
						if(data == -1) //�о�帱 �����Ͱ� ���� �� -1 ��ȯ
							break;
						out.write(data);
						//����Ʈ ����� ����̹Ƿ� int�� �̾ ���X
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

}
