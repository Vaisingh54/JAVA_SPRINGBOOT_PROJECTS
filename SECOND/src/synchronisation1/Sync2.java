package synchronisation1;

public class Sync2 extends Thread{
	
      ServiceImpl ss;
	
	public Sync2(ServiceImpl ss) {
	this.ss=ss;
	   }

	@Override
	public void run() {
		ss.withdraw(5000);
		
		super.run();
	}

}
