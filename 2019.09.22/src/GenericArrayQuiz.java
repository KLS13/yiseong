class MyArray<T>{
	T[] arr;


	void setArr(T[] arr) {
		this.arr = arr;
	}
	void viewArr() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
public class GenericArrayQuiz {

	public static void main(String[] args) {
		MyArray<Integer> arr1 = new MyArray<Integer>();
		MyArray<String> arr2 = new MyArray<String>();
		
		Integer[] i_arr = {1,2,3,4,5};
		arr1.setArr(i_arr);
		String[] s_arr = {"hi", "bye"};
		arr2.setArr(s_arr);
		
		arr1.viewArr();
		arr2.viewArr();
	}

}
