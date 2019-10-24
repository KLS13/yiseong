import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

class Iostream8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream
				(new FileOutputStream("data.dat")))) {
			out.writeInt(370);
			//단, 이때는 버퍼링까지 추가되어 있음! 따라서 훨씬 빨라진다.
			out.writeDouble(3.14);
			//단, 이때는 버퍼링까지 추가되어 있음! 따라서 훨씬 빨라진다.
		}
		catch(IOException e) { 
			e.printStackTrace();
		}
		
	}

}
