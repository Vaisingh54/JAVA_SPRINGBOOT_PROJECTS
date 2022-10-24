package multiThread;

public class Class1 implements Runnable {
	
	Thread th;
	
	
	public Class1()
	{
		th=new Thread(this);
		th.start();
	}
	
	
	

	public static void main(String[] args) {
		
		
		Class1 c1=new Class1();
		
		
		for(int i=0;i<8;i++)
		{
		  System.out.println("Main Thread");
		}
		

	}

	@Override
	public void run() {
		for(int i=0;i<8;i++)
		{
		  System.out.println("Child Thread");
		}
		
	}

}
