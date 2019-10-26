import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class StringStream5 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("String.txt"))) {
			String str;
			
			while(true) {
				str = br.readLine(); // 한줄 단위로 읽어들인다.
				if(str == null) // 읽을 내용 없을 시 null 반환됨.
					break;
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
