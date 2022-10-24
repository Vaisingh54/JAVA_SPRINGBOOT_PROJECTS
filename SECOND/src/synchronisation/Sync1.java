package synchronisation;

public class Sync1  extends Thread{

	MultiplicationTable mt;
	
	Sync1(MultiplicationTable mt)
	{
		this.mt=mt;
	}
	
	@Override
	public void run() {
		
		try {
			mt.table(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		super.run();
	}
	
}
