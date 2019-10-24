import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//버퍼링 기능을 제공하는 필터 스트링
public class IoStream7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일 : ");
		String src = sc.nextLine();		
		
		System.out.print("사본이름 : ");
		String dst = sc.nextLine();
		
		long start = System.currentTimeMillis();
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))) {
			
			int data;
			while(true) {
				data = in.read();
				if(data == -1) //읽어드릴 데이터가 없을 시 -1 반환
					break;
				out.write(data);
				//바이트 기반의 출력이므로 int형 이어도 상관X
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
long end = System.currentTimeMillis();
System.out.println(end - start);

}

}


