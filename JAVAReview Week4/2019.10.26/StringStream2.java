import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class StringStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" 읽을 파일 : ");
		String src = sc.nextLine();
		
		try(Reader in = new FileReader(src)) {
			int ch;
			
			while(true) {
				ch = in.read(); //유니코드가 반환된다
				if(ch==-1) // 읽을 데이터가 없으면 -1 반환
					break;
				System.out.print((char)ch); // 유니크도를 문자로 변환하여 출력
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
