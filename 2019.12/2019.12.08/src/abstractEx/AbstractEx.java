package abstractEx;

public class AbstractEx {

	public static void main(String[] args) {
		HourWorker hw = new HourWorker("È«±æµ¿");
		hw.getInfo();
		
		WeeklyWorker ww = new WeeklyWorker("±è±æµ¿");
		ww.getInfo();
		
		MonthlyWorker mw = new MonthlyWorker("°í±æµ¿");
		mw.getInfo();
	}

}
