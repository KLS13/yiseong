public class ArrayTest01 {
    public static void main(String[] args) {
 
        // ���� 
        int num1 = 10;                // ������ ����� �ʱ�ȭ 
        System.out.println(num1);    // 10
        
        int num2;                    // ������ ����
        num2 = 20;                    // ������ �ʱ�ȭ
        
        // �迭 
        int[] arr = new int[3];            // ������ ����
        System.out.println(arr);
     
        // [ : �迭, I : Integer, e: 16����
        
        System.out.println(arr[0]);    // 0
        System.out.println(arr[1]);    // 0
        System.out.println(arr[2]);    // 0
        
        int[] arr2 = null;                // ������ ������ ����� �ʱ�ȭ
        arr2 = new int[3];
        System.out.println(arr2);
        
    }
}
