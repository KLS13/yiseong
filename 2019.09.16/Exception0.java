//배열인덱스 예외를 처리할 수 있도록 해보자!
public class Exception0 {

	public static void main(String[] args) {
		// try - catch 로 해보자.
		
		try {
			//예외가 발생할 수 있는 문장  try로 묶음.
			int[] arr = new int[3];
			arr[5]=3;
		}catch(ArrayIndexOutOfBoundsException e  /*어떤 예외가 올지. 예외의 종류*/) {
			//어떻게 처리할것인가 ?
			System.out.println("예외 발생했네요!");
		}
		

	}

}
