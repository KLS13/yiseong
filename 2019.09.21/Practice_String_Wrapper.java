//String scores = "100,11,35,41"
//���Ͱ��� �������� ���ڿ� ���·� �־�������, �־��� �������� ������ ����� ���ϴ� �ۼ�
//���ڿ��� �и���Ų����,  �����ڿ��� ���ڷ� ��ȯ
//������ ���

public class Practice_String_Wrapper {

	public static void main(String[] args) {

		String scores = "100,11,35,41";
		String[] arScore = scores.split(",");
		//���ڿ� �и� split!
		
		
		int total = 0;
		double avg = 0.0;
		//���� �� ���
		
		for(int i=0; i<arScore.length; i++) {
			total += Integer.parseInt(arScore[i]);
			
		}
		avg = (double)total / arScore.length;
		//����� �� ��ȯ,  �Ҽ������� ì�ܼ� ����� ���ϱ�.
		
		System.out.println(total);
		System.out.println(avg);
	
	
		
	}


}