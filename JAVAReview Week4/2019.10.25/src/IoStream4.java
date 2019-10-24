import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
//���� ����� ���� ���� ���α׷� !!  ( �� ���� )
public class IoStream4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ���� : ");
		String src = sc.nextLine();		
		
		System.out.print("�纻�̸� : ");
		String dst = sc.nextLine();
		long start = System.currentTimeMillis();
		try(InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dst)){
			byte buf[] = new byte[1024];
			int len;
						
			while(true) {
					len = in.read(buf);
					if(len == -1) //�о�帱 �����Ͱ� ���� �� -1 ��ȯ
						break;
					out.write(buf, 0, len);
						//����Ʈ ����� ����̹Ƿ� int�� �̾ ���X
				}
			}catch(IOException e) {
					e.printStackTrace();
				}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

}
