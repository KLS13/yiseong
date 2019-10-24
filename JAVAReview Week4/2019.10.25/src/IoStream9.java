import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.DataInputStream; 
import java.io.FileInputStream;


public class IoStream9 {

	public static void main(String[] args) {
		try(DataInputStream in = new DataInputStream(new BufferedInputStream
				(new FileInputStream("data.dat")))) {
			int num1 = in.readInt();
			double num2 = in.readDouble();
			
			System.out.println(num1);
			System.out.println(num2);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
