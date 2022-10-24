package functionalInterface;

public class ExeMax  {
	
	
	public Integer maxical(int a,int b)
	{
		return  (a>b?a:b);
		
	}
	/*
	 * public static Integer maxical(int a,int b) { return (a>b?a:b);
	 * 
	 * }
	 */

	public static void main(String[] args) {
		ExeMax ee=new ExeMax();
		
		MaxiNum<Integer, Integer, Integer> m=ee::maxical;
		System.out.println(m.compare(5, 8));
		
		/*
		 * MaxiNum<Integer, Integer, Integer> m=ExeMax::maxical;
		 * System.out.println(m.compare(5, 8));
		 */
		
		/*
		 * MaxiNum<Float, Float, Float> m=(a,b)->{return a>b?a:b;};
		 * System.out.println(m.compare(4f, 5f));
		 */
	}

	
}
