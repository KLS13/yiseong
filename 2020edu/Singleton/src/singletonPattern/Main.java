package singletonPattern;
/*
고정된 메모리 영역을 사용하도록 단 한번 new 연산자로 인스턴스를 얻어오기때문에 메모리의 낭비를 줄입니다.
전역변수로 선언되고 전역메서드로 호출 하기 때문에 다른 클래스에서 사용하기 쉽습니다.
공통된 객체를 사용해야하는 코딩에서 매번 객체를 생성하지않고 같은 객체를 사용하도록 하면 성능면에서 훌륭해 진답니다.
 */

public class Main {
	
    public static void main(String[] args) {
        Normal normal1 = new Normal();
        Normal normal2 = new Normal();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        if(normal1 == normal2) {
            System.out.println("normal1과 normal2는 서로 같음");
        }else {
            System.out.println("normal1과 normal2는 서로 다름");
        }
        
        if(singleton1 == singleton2) {
            System.out.println("singleton1과 singleton2는 서로 같음");
        }else {
            System.out.println("singleton1과 singleton2는 서로 다름");
        }
    }
}
