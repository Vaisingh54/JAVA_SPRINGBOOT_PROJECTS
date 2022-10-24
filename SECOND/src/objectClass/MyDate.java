package objectClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyDate {
	
	private int dd,mm,yy;
	
	

	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	
     
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dd;
		result = prime * result + mm;
		result = prime * result + yy;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (dd != other.dd)
			return false;
		if (mm != other.mm)
			return false;
		if (yy != other.yy)
			return false;
		return true;
	}


	public static void main(String[] args) {
		
		MyDate m1=new MyDate(10,10,2010);
		MyDate m2=new MyDate(10,10,2010);
		
		
		Class<MyDate> aa=(Class<MyDate>) m1.getClass();
		
		Method[] m=aa.getDeclaredMethods();
				for(Method mTemp:m)
				
					System.out.println(mTemp.getName());
				
		Field f[]=aa.getDeclaredFields();
		
		  for(Field mTemp:f)
			  
			  System.out.println(mTemp.getName());
		  
		
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		if(m1.equals(m2)){
			
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}

}
