package Practice2;

public class th{
	
	private class CStore implements Runnable{

int cps = 10;

public void run() {

while(cps>0)

try {

Thread.sleep(1500);

}catch(Exception e) {

System.out.println(e);

}

synchronized(this) {

cps=1;

System.out.print(cps);

}

}

}

public static void main(String[] args) {

CStore cs = new CStore();

Thread th1=new Thread(cs);

Thread th2=new Thread(cs);

th1.start();
th2.start();



}}