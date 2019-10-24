import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class IoStream1 {

	public static void main(String[] args) throws IOException {
		
		OutputStream out = new FileOutputStream("data.dat");
		/*
		 * 어떤 파일을 대상으로 출력스트림을 생성 및 연결을 하겠다.
		 * 이때, 대상 파일이 존재하면 존재하는 파일에, 존재 하지않으면 파일을 새로 만들어 연결함.
		 */
		out.write(7);
		//기본적으로 데이터는 바이트 기반으로 출력된다.
		out.close();
		//스트림 생성 후 볼일이 끝나면, (반드시) 닫아주어야 한다.

	}

}
