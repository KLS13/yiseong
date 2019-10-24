import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//���۸� ����� �����ϴ� ���� ��Ʈ��
public class IoStream7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("��� ���� : ");
		String src = sc.nextLine();		
		
		System.out.print("�纻�̸� : ");
		String dst = sc.nextLine();
		
		long start = System.currentTimeMillis();
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))) {
			
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


