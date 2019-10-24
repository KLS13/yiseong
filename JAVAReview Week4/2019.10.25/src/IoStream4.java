import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
//버퍼 기반의 파일 복사 프로그램 !!  ( 더 빠름 )
public class IoStream4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일 : ");
		String src = sc.nextLine();		
		
		System.out.print("사본이름 : ");
		String dst = sc.nextLine();
		long start = System.currentTimeMillis();
		try(InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dst)){
			byte buf[] = new byte[1024];
			int len;
						
			while(true) {
					len = in.read(buf);
					if(len == -1) //읽어드릴 데이터가 없을 시 -1 반환
						break;
					out.write(buf, 0, len);
						//바이트 기반의 출력이므로 int형 이어도 상관X
				}
			}catch(IOException e) {
					e.printStackTrace();
				}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

}
