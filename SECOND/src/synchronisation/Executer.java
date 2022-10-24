package synchronisation;

public class Executer {

	public static void main(String[] args) {
		
		
		MultiplicationTable mt=new MultiplicationTable();
		
       Sync1 s1=new Sync1(mt);
       Sync2 s2=new Sync2(mt);
		
       s1.start();
       s2.start();
		

	}

}
