//프로세스 : 실행중인 프로그램 ( 실행중이지않을땐 그냥 프로그램 )
//윈도우즈 : 컴퓨터 사용을 편리하게 해주는 시스템 중 하나
//--> 운영체제 (Operating System) 
//운영체제가 하는 중요한 일 중 하나
//--> 프로그램을 실행시키고, 그것을 관리하는 일
//프로그램(평상시에는 ROM에 저장됨) Read Only Memory
//프로세스(RAM 위에 올라간 상태 ) Random Access Memory
//--> 스레드 : 프로세스 내에서 작업을 처리하는 최소 단위
//////////////////////////////////////////////////////////
class Task1 extends Thread{ // Thread 클래스를 상속받아 작업을 만드는 것.

	@Override
	public void run() {
	//여기에 쓰레드가 처리할 작업을 넣어주면 된다.
	} //run 이라는 메서드를 정의.
	//runnanle 인터페이스를 구현하여 스레드 작업을 만드는것.
	
}
//Runnable 인터페이스를 구현하여 스레드 작업을 ㄷ만듬
class Task2 implements Runnable{
	public void run() {
		//여기에 쓰레드가 처리할 작업을 넣어주면 된다.
		} //run 이라는 메서드를 정의.
		//runnanle 인터페이스를 구현하여 스레드 작업을 만드는것.
}

//작업이라면 무조건 run() 일거라는 오해가 생기면 안됨 !!!!!!!!!!!!!!!!
//일반적으로, 다중 상속(구현)을 하기위해서 Runnable로 만듬.

public class Thread1{

	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		//Thread.currentThread() : 이 작업이 처리되고 있는 스레드 정보
		String name = ct.getName(); // 스레드명 반환!
		System.out.println(name); //main
		//--> main도 하나의 스레드였따!
	}
}
