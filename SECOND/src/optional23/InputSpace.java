package optional23;

public class InputSpace {

	public static void main(String[] args) {
		StringInput ss=(s)->{StringBuilder sb = new StringBuilder(s);
		for (int i=1; i<sb.length(); i+=2)
		    sb.insert(i, ' ');
		System.out.println(sb.toString());};
		
		ss.change("VAIBHAV");
	}
}
