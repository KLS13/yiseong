public class ArrayTest11 {
    public static void main(String[] args) {
 
        char[] arr = new char[26];
 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (90 - i);
            System.out.print(arr[i] + " ");
        }
 
    }
}
