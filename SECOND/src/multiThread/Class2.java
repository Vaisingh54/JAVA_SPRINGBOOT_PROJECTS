package multiThread;

public class Class2 extends Thread {
	
	
	
	@Override
	public void run() {
		for(int i=0;i<8;i++)
		{
		  System.out.println("Child Thread");
		}
		
	}

	public static void main(String[] args) {
		
		Class2 c2=new Class2();
		
	c2.start();
	
		
		
		
		for(int i=0;i<8;i++)
		{
		  System.out.println("Main Thread");
		}
		
		
	}

}
