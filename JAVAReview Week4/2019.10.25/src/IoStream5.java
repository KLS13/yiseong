import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
//출력 필터 스트림의 예

public class IoStream5 {
	//출력스트림을 필터스트림이 감싼 형태로 스트림 생성 !
	public static void main(String[] args) {
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("data.dat"))) {
			out.writeInt(370); // 바이트 단위가 아닌 int로 출력... 파일에는 바이트로 쪼개져서 들어ㄱ감.
			out.writeDouble(3.14);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
