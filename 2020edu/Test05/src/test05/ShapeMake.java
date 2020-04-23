package test05;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ShapeMake {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("숫자를 입력하시오(홀수,양수)");
            n = sc.nextInt();
            if (n % 2 == 0 || n <= 0) {
                System.out.println("홀수만 입력해주세요(양수입력해주세요)");
            } else {
                break;
            }
        }

        /*
         * 마름모
         * */
        System.out.println("마름모 모양");
        int i, j = 0;
        int star = 0;
        //처음위에 삼각형
        for (i = 0; i < n; i += 2) {    //윗삼각형의 높이는 밑변개수의 1/2를 만들기위해 i를 2씩 증가시킴
            for (j = n; j >= i; j -= 2) {   // 아이는 계속 2씩 증가하므로 제이는 밑변개수(n)으로 두고 2씩 감소시키면 줄이 바뀔때마다 공백이 한개씩 줄어들게 됨
                System.out.print("  ");
            }
            for (star = 0; star <= i ; star++) { //찍을 별의 개수를 2개씩증가시킴
                System.out.print("* ");
            }
            System.out.println();   //줄바꿈
        }
        //밑역삼각형
        for (i =0; i <= n - 2; i += 2) {   //윗삼각형에 비해 1줄 적게 출력되고 최대개수가 2개 적으므로 n-2해줌
            System.out.print("  "); //줄맞춤
            for (j = 0; j <= i; j += 2) {   //제이의 공백이 2개로 시작하여 하나씩 늘어나게함
                System.out.print("  ");
            }
            for (star = n - 2; star > i; star--) { //별의개수는 2개씩 점점 줄어들게찍는다.(입력개수보다 2개 적게시작함) (위에삼각형과 부등호같은건 반대로해주면됨)
                System.out.print("* ");
            }
            System.out.println();
        }


        /*
         *           별모양
         * */

        /*
         *     상단
         * */
        //맨위 정삼각형 하나
        for (i = 0; i < n; i += 2) {
            //입력한 수만큼 오른쪽으로 삼각형 땡겨줌
            for (int a = 0; a < n; a++) {
                System.out.print("  ");
            }
            //나머지는 마름모할때 윗부분삼각형과 동일함
            for (j = n; j >= i; j -= 2) {
                System.out.print("  ");
            }
            for (star = 0; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         *   중단
         * */
        int count = n * 3; //중단의 최대길이

        for (i = 0; i < n / 2 + 1; i++) { //높이를 입력한 크기의 2분의1정도로 하여 균형을 맞춤
            System.out.print("  ");   //줄맞춤용
            for (j = 0; j < i; j++) { // i의 크기만큼 공백을 줘서 별이 찍힐 시작점을 맞춤(i는 1씩 증가하니깐 공백도 1씩 증가
                System.out.print("  ");
            }
            for (int k = 0; k < n * 3; k++) { //입력한 크기의 3배만큼 별을 찍어야함
                if (k < count) {    //단, count라는 개수보다 적을때만 별을 찍음(count는 별의 개수를 나타내는 변수임, 2개씩 줄어들게 해놨음)
                    System.out.print("* ");
                }

            }
            //몸통 한줄 더 키울려고 추가함
            if(i == n/2){
                System.out.println();
                System.out.print("  ");   //줄맞춤용
                for (j = 0; j < i; j++) { // i의 크기만큼 공백을 줘서 별이 찍힐 시작점을 맞춤(i는 1씩 증가하니깐 공백도 1씩 증가
                    System.out.print("  ");
                }
                for (int k = 0; k < n * 3; k++) { //입력한 크기의 3배만큼 별을 찍어야함
                    if (k < count) {    //단, count라는 개수보다 적을때만 별을 찍음(count는 별의 개수를 나타내는 변수임, 2개씩 줄어들게 해놨음)
                        System.out.print("* ");
                    }

                }
            }

            count -= 2; //다음에 찍힐 별을 2개줄임
            System.out.println();
        }

        /*
         *    하단
         * */
        count = n;//왼쪽밑둥용(중단에서 사용한거 재활용)
        int count2 = 0;//오른쪽밑둥용
        for (i = 0; i < n/2+1; i++) {   //하단줄의 개수를 밑변개수의 절반만큼으로함
            System.out.print("  ");
            for (j = i; j < n / 2; j++) {   //절반만큼의 공백을 띄움
                System.out.print("  ");
            }
            //별(왼쪽밑)
            for (int k = 0; k < n; k++) { //입력개수만큼 별찍기를하는데 k가 count보다 작을때만 별을 찍음
                if (k < count) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  "); //정가운데 공백

            //count2를 이용해 오른쪽밑둥을 오른쪽을 떙겨줌
            for (j = 0; j < count2; j++) {
                System.out.print("  ");
            }
            //별(오른쪽밑)
            for (int k = 0; k < n; k++) {
                if (k < count) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            count -= 2;
            count2 += 4;
            System.out.println();
        }



        //동그라미
        System.out.println();
        System.out.println("동그라미 모양");


        for (i = 0; i <= n * 2; i++) {
            for (j = 0; j <= n * 2; j++) {
                //원의 중심좌표(n,n)로부터 (i,j)사이의 거리를 구함
                int d = (int) sqrt((i - n) * (i - n) + (j - n) * (j - n));
                //(i,j)좌표가 (n,n)사이의 거리가 반지름의길이 이하일때  좌표를 찍는다.
                if (d <= n) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}