package test01;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		TravelCustomer person1 = new TravelCustomer("°­ÀÌ¼º", 27, 1000000);
		TravelCustomer person2 = new TravelCustomer("ÀÚ¹ÙÂ¯", 40, 1000000);
		TravelCustomer person3 = new TravelCustomer("ÆÄÀÌ½ã", 10, 500000);
		
		List<TravelCustomer> personList = new ArrayList<TravelCustomer>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		
		
		personList.stream().map(p -> p.getName()).forEach(s->System.out.println(s));
		
		int total = personList.stream().mapToInt(c-> c.getPrice()).sum();
		System.out.println(total);
		
		personList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));

	}

}
