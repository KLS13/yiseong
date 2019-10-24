import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStream1_improve1 {

	public static void main(String[] args) throws IOException {
		OutputStream out = null;
		
		try {
			//두 문장은 모두 예외발생 가능성이 있따.
			// --> 연결이 될수도 있고 안될수도 있다.
			out = new FileOutputStream("data.dat");
			out.write(7);
		}finally { // try 이후 반드시 실행되는 부분이다.
			if(out !=null)
				out.close();
			//스트림이 잘 생성되었따면 close 해주고, 아니면 말고~
			
		}

	}

}
