public class ContinueBasic {

	public static void main(String[] args) {

		int i = 0;
		while(i<11) {
			i++;
			if(i%2==0) {
				continue; // ¦���� �����ϰ� ���~
			}
			System.out.println("i��" + i);
		}
	}

}
