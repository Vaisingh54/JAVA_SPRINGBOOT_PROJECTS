package synchronisation;

public class Sync2 extends Thread {
	
MultiplicationTable mt;
	
	Sync2(MultiplicationTable mt)
	{
		this.mt=mt;
	}
	
	@Override
	public void run() {
		
		try {
			mt.table(7);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		super.run();
	}
	

}
