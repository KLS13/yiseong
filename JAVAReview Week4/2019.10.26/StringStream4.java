import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class StringStream4 {

	public static void main(String[] args) {
		String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
		String es = "Life is long if you know how to use it.";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))) {
			bw.write(ks, 0, ks.length());
			//ks를 0번 인덱스부터 ks의 길이만큼 출력한다.
			//"공부에 있어서 돈이 꼭 필요한것은 아니다."
			bw.newLine(); // 개행을 의미하는 메소드!
			//newLine 메소드가 존재하는 이유
			//OS(윈도우, 리눅스, 맥OS...) 별로 개행을 표현하는 문자가 조금씩 다르기때문.
			//자바가 알아서 개행 문자를 표시하게끔 해준 것.
			bw.write(es, 0, es.length());
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
