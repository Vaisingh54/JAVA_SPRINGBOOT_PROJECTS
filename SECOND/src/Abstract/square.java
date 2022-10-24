package Abstract;

public class square extends shape {

	private float len;
	
	
	square(){
		
		len=10;
		
	}
	
	
	
	@Override
	public void calArea() {
		
		setArea(len*len);

	}

	@Override
	public void calPerimeter() {
		setPerimeter(4*(len));

	}

}
