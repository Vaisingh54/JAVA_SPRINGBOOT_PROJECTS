package synchronisation1;

public class Sync1 extends Thread{
	
	
	ServiceImpl ss;
	
	public Sync1(ServiceImpl ss) {
	this.ss=ss;
	}
	
	@Override
	public void run() {
		try {
			ss.deposit(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		super.run();
	}

}
