public class ArrayTest02 {
    public static void main(String[] args) {
 
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        
 
        // for(int i=0; i<3; i++) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
 
        System.out.println("배열의 길이: " + arr.length);
 
    }
}