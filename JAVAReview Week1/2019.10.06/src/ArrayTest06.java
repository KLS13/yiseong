public class ArrayTest06 {
    public static void main(String[] args) {
 
        int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
 
        for (int i = 0; i < arr.length; i++) {
            if (i == 3) {
                continue;
            }
 
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
 
    }
}
