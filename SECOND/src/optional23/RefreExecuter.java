package optional23;

public class RefreExecuter {
	
	
	public Integer check(Integer a ,Integer b )
	{
		return a+b;
	}
	
public static void main(String[] args) {
	RefreExecuter rf=new RefreExecuter();
	
	RefreCheck<Integer, Integer, Integer> rr=rf::check;
	
	System.out.println(rr.check1(4, 5));
	

}
}

