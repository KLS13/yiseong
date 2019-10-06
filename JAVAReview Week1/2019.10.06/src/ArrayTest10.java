public class ArrayTest10 {
    public static void main(String[] args) {
 
        char[] arr = new char[26];
        char[] arr2 = new char[26];
 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (65 + i);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
        	arr2[i] = (char) (97 + i);
        	System.out.print(arr2[i] + " ");
        }
 
    }
}
