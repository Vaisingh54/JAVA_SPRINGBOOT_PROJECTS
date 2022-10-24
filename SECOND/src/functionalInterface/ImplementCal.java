package functionalInterface;

public class ImplementCal {

	public static void main(String[] args) {
	Calculator<Float, Float, Float>cc=(a,b)->{return a+b;};
	System.out.println(cc.add(4f, 5f));
	}

}






