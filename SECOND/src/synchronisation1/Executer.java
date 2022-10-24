package synchronisation1;

import java.util.Scanner;

public class Executer {

	public static void main(String[] args) {
		ServiceImpl ss=new ServiceImpl();
		
		
		Scanner sc=new Scanner(System.in);
		
		ss.setBalance(sc.nextDouble());
		
		
	
		
		
		Sync1 s1=new Sync1(ss);
		
		Sync2 s2=new Sync2(ss);
		
		s1.start();
		s2.start();
	}

}
