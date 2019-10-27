//다음 두 클래스에 적절한 생성자와 소멸자를 정의
// 생성자 - 생성될 때 호출
// 소멸자 - 소멸될 때 호출(finalize)
// 이때, 소멸시에는 "소멸"이라는 메세지를 출력한다.
// 그리고 이의 확인을 위한 main 함수를 정의
// 생성--> 정보확인--> 갈비지 컬렉션 대상으로 만듬 --> 소멸

class MyFriendInfo{
	protected String name;
	private int age;
	
	 MyFriendInfo(String name, int age){
		 this.name = name;
		 this.age = age;
	 }
	
	public void ShowMyFriendInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
class MyFriendDatailInfo extends MyFriendInfo{
	private String addr;
	private String phone;

	public MyFriendDatailInfo(String name, int age, String addr, String phone) {
		
	
	}
	
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println(this.name + "소멸");
	}

	
	public void ShowFriendDetailInfo() {
		ShowMyFriendInfo();
		System.out.println("주소 : " + addr);
		System.out.println("전번 : " + phone);
	}
}
public class Practice02 {
	

	public static void main(String[] args) {
		MyFriendDatailInfo f1 = new MyFriendDatailInfo("강동원", 30,"대구광역시", "010-3074-5687");
		MyFriendDatailInfo f2 = new MyFriendDatailInfo("김동원", 31,"대전광역시", "010-2074-5687");
		f1.ShowFriendDetailInfo();
		f2.ShowFriendDetailInfo();
		
		f1 = null;
		f2 = null;

		System.gc();
		System.runFinalization();
	}

}
