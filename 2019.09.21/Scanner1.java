import java.io.FileInputStream;
import java.util.Scanner;

// system.in 이 아니더라도 입력을 받을수 있는 방법은 많다.
public class Scanner1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("src/Sample.txt");
			Scanner s = new Scanner( fis );
			while ( s.hasNext()) {  //hasNext란 ?  읽어들일 내용이 있을 경우 true를 반환한다
				System.out.println( s.nextLine());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
