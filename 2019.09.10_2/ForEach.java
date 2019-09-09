public class ForEach {

	public static void main(String[] args) {

		char[] alpha = {'S', 'M', 'A','R', 'T'};
		
		for(char i : alpha) {
			//배열의 요소 수만큼 반복되면서, i 에는 각각 요소가 차례로 대입된다.
			System.out.print(i);
		}
		
	}

}
