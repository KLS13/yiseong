import java.util.*;

class NumBox {
	
	int num;
	
	NumBox(int n){
		num = n;
	}
	//해쉬코드에 대한 내부 알고리즘을 우리가 정의해 줄 수 있따.
	
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
		//일단 객체의 해쉬코드를 구한다 -> 0
		//그다음, 해쉬코드가 0인 애들끼리만 equals 비교를 한다.
		
		
		for(NumBox n : ns) {
			System.out.print(n.num + " ");
			
		}
		

	}

}
