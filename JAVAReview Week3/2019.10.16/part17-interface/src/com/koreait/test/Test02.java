package com.koreait.test;
interface Providable {
	void sightseeing();
	void leisure();
	void food();
}
class KoreaTour implements Providable {
	@Override
	public void sightseeing() {
		System.out.println("��ȭ�� ����");
	}
	@Override
	public void leisure() {
		System.out.println("�Ѱ� ������");
	}
	@Override
	public void food() {
		System.out.println("�Ұ��");
	}
}

class GuamTour implements Providable {
	@Override
	public void sightseeing() {
		System.out.println("����� ����");
	}
	@Override
	public void leisure() {
		System.out.println("���� ��ġ");
	}
	@Override
	public void food() {
		System.out.println("����");
	}
}
class TourGuide {
	//private KoreaTour tour;   --> �̷��� �ڸ��� ��� ������ ���̵� !!
	private Providable tour; // --> Providable �� ������ ��� ������ ������ ���̵尡 ��.
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
