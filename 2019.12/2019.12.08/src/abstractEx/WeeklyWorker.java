package abstractEx;

public class WeeklyWorker extends Employee {

	int payHour = 5000;
	int workHour = 8;
	int workWeek = 2;
	
	public WeeklyWorker(String name){
		super(name);
	} 
	
	public int income(){
		return (payHour * workHour) * (workWeek*5);
	}
}
