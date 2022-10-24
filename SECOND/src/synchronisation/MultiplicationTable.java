package synchronisation;

public class MultiplicationTable  {
	
	public void table(int n) throws InterruptedException 
	{
		
		synchronized (this) {
			for(int i=1;i<=10;i++)
			{
				System.out.println(i*n);
				Thread.sleep(1000);
			}
			
		}
		
	}

}
