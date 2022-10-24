package Abstract;

public class rectangle extends shape {

	private float len;
	private float bre;
	
	rectangle(){
		
		len=10;
		bre=12;
	}
	
	
	
	@Override
	public void calArea() {
		
		setArea(len*bre);

	}

	@Override
	public void calPerimeter() {
		setPerimeter(2*(len+bre));

	}


}
