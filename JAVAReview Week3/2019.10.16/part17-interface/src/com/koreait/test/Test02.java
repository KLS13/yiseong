package com.koreait.test;
interface Providable {
	void sightseeing();
	void leisure();
	void food();
}
class KoreaTour implements Providable {
	@Override
	public void sightseeing() {
		System.out.println("광화문 관광");
	}
	@Override
	public void leisure() {
		System.out.println("한강 유람선");
	}
	@Override
	public void food() {
		System.out.println("불고기");
	}
}

class GuamTour implements Providable {
	@Override
	public void sightseeing() {
		System.out.println("사랑의 절벽");
	}
	@Override
	public void leisure() {
		System.out.println("투몬 비치");
	}
	@Override
	public void food() {
		System.out.println("피자");
	}
}
class TourGuide {
	//private KoreaTour tour;   --> 이러면 코리안 투어만 가능한 가이드 !!
	private Providable tour; // --> Providable 을 구현한 모든 여행이 가능한 가이드가 됨.
	public TourGuide(Providable tour) {
		this.tour = tour;
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void leisure() {
		tour.leisure();
	}
	public void food() {
		tour.food();
	}
}

public class Test02 {

	public static void main(String[] args) {
		KoreaTour tour = new KoreaTour();
		GuamTour tour2 = new GuamTour();
		TourGuide guide = new TourGuide(tour);
		TourGuide guide2 = new TourGuide(tour2);
		
		guide.sightseeing();
		guide.leisure();
		guide.food();
		
		guide2.sightseeing();
		guide2.leisure();
		guide2.food();

	}
}
