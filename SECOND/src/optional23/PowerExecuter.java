package optional23;

public class PowerExecuter {

	public static void main(String[] args) {
		
		PowerCal<Double, Integer, Integer>pc=(a,b)->{return Math.pow(a, b);};
		
		
		System.out.println(pc.power(4, 5));
	}


}
