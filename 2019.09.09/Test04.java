public class Test04 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		do {
			i++;
			
			if(i%2!=0) {
				continue; // ���� ¦���� �ƴҰ�� �����ϰ� 
			}
			sum+=i; // i���� sum�� ����
			
		}
		while(i<=100); // i�� 100���� ���ų� ����������.
		System.out.println(sum); 
	}
}