import java.util.*;

class NumBox {
	
	int num;
	
	NumBox(int n){
		num = n;
	}
	//�ؽ��ڵ忡 ���� ���� �˰����� �츮�� ������ �� �� �ֵ�.
	
	@Override
	public int hashCode() {
		return this.num%3;
	}
	
	public boolean equals(Object obj) {

		NumBox comp = (NumBox)obj;
		if(this.num == comp.num) {
			return true;
		}else {
			return false;
		}
		
	}
	
}

public class HashPractice {

	public static void main(String[] args) {
		HashSet<NumBox> ns = new HashSet<>();
		
		ns.add(new NumBox(1));
		ns.add(new NumBox(1));
		ns.add(new NumBox(1));
		ns.add(new NumBox(3));
		ns.add(new NumBox(3));
		//�ϴ� ��ü�� �ؽ��ڵ带 ���Ѵ� -> 0
		//�״���, �ؽ��ڵ尡 0�� �ֵ鳢���� equals �񱳸� �Ѵ�.
		
		
		for(NumBox n : ns) {
			System.out.print(n.num + " ");
			
		}
		

	}

}
