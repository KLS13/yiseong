public class ArrayTest01 {
    public static void main(String[] args) {
 
        // 변수 
        int num1 = 10;                // 변수의 선언과 초기화 
        System.out.println(num1);    // 10
        
        int num2;                    // 변수의 선언
        num2 = 20;                    // 변수의 초기화
        
        // 배열 
        int[] arr = new int[3];            // 변수의 선언
        System.out.println(arr);
     
        // [ : 배열, I : Integer, e: 16진법
        
        System.out.println(arr[0]);    // 0
        System.out.println(arr[1]);    // 0
        System.out.println(arr[2]);    // 0
        
        int[] arr2 = null;                // 참조형 변수의 선언과 초기화
        arr2 = new int[3];
        System.out.println(arr2);
        
    }
}
