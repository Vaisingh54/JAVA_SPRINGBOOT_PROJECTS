package enumClass;

public enum Months {
	
	
	JAN(1,31),FEB(2,28),MAR(3,31),APR(4,30),MAY(5,31),JUNE(6,30),JULY(7,31),AUG(8,31),SEP(9,30),OCT(10,31),NOV(11,30),DEC(12,31)
	
	private int month,days;
	
	Months(int month, int days){
		
		this.days=days;
		this.month=month;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	
	

}
