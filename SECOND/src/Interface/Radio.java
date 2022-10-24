package Interface;

public class Radio implements Pendrive{

	 @Override
	public void read() {
	System.out.println("Radio reads");
	}

	 @Override
	public void scan() {
	System.out.println("Radio scans");
	}

	}
