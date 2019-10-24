import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IoStream2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream in = new FileInputStream("data.dat");
		/*
		 * 해당 파일이 존재하지 않으면 예외발생
		 */
		int dat = in.read(); // 읽어들인 데이터는 반환값으로 반환된다.
		in.close(); //스트림 연결 해제하기 잊지말자 !
		
		System.out.println(dat);
	}

}
