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
			//��, �̶��� ���۸����� �߰��Ǿ� ����! ���� �ξ� ��������.
			out.writeDouble(3.14);
			//��, �̶��� ���۸����� �߰��Ǿ� ����! ���� �ξ� ��������.
		}
		catch(IOException e) { 
			e.printStackTrace();
		}
		
	}

}
