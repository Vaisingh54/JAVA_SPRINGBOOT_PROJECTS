package practiceColl;

import java.time.Duration;
import java.time.LocalDate;

public class KuchBhi {

	public static void main(String[] args) {
		
		Duration due=Duration.ofDays(-3);
		LocalDate id=LocalDate.of(2016, 1, 1);
		System.out.println(id.plusDays(due.toDays()));
		

	}

}
