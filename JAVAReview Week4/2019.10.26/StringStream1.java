import java.io.Writer; //바이트기반으로 했을때 아웃풋스트링과 대응
import java.io.FileWriter; //파일 아웃풋스트링과 대응
import java.io.IOException; 
// 문자 스트림의 존재 이유 : 각 환경에 맞는 인코딩 방식을 지원하기 위해서
// 인코딩 : 바이너리 데이터를 표현 방식에 맞추어 문자로 변환해주는 것!
// 디코딩 : 인코딩의 반대~
class StringStream1 {

	public static void main(String[] args) {
		try(Writer out = new FileWriter("data.txt")) {
			//Writer는 OutputStream과 대응 
			//FileWriter는 FileOutputSteam과 대응된다.
			out.write('A'); //A 저장
			out.write('헐'); //헐 저장
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
