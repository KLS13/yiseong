import java.util.*;
/*
 * ArrayList : �迭 ����� ����Ʈ
 * LinkedList : ���� ����� ����Ʈ(��Ұ� �߰��� ������ ������ ���� �Ҵ�)
 * ��ɸ鿡���� �� ����Ʈ�� ���� ���̰� ����.
 * ��Ȳ�� ���� ���̴� �����Ѵ�.
 */
public class ArrayList1 {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<>();
		//�迭 ����� ����Ʈ
		
		a1.add("Toy");
		a1.add("Box");
	    a1.add("Robot");
	    //���� ������ �����ȴ�
	    
	    //arr.length < -- > ArrayList.size()
	    for(int i = 0 ; i < a1.size(); i++) {
	    	System.out.print(a1.get(i) + " ");
	    
	    } // get(i) : i�� ��Ҹ� ��ȯ�ҰŴ�.
	    
	    System.out.println("");

	    a1.remove(0); // 0�� ��Ҹ� ���� ���̴�.
	   
	    for(int i = 0 ; i < a1.size(); i++) {
	    	System.out.print(a1.get(i)+ "");
	    }
	}

}
