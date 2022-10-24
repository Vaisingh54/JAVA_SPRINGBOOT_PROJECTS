package functionalInterface;

public class ExecuterString{
	
	public ExecuterString(String a,String b)
	{
		 if(a.length()>b.length())
		 {
			 a.toUpperCase();
		 System.out.println(a);}
		 else
		 { b.toUpperCase();
		 System.out.println(b);}
	}

	public static void main(String[] args) {
		
		CheckString<String,String> as=ExecuterString::new;
		
		
		as.check("What", "Nowwhat");
		
		/*
		 * CheckString<String,String,String>
		 * tu=(a,b)->a.length()>b.length()?a.toUpperCase():b.toUpperCase();
		 * System.out.println(tu.check("Hello","World!!"));
		 */

	 

	}

	
}
