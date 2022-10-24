package Interface;

public class ExecuterPendrive {

	public static void main(String[] args) {
		Pendrive pd=new DeskTop();
		pd.read();
		pd.write();
		pd.scan();
		pd.format();

	}

}
